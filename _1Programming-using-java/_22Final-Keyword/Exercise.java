/**
 * An educational institution provides stipends for post-graduate students every year. 
 * For calculating the stipend, the institution has fixed a base amount of $100 which is provided to all the students. 
 * The students who perform exceptionally well during the academics get an extra amount based on their performance.
 * You need to help the institution in developing an application for calculating the stipend by implementing the 
 * class based on the class diagram and description given below.
 * Method Description
 * calculateTotalStipend()
 * Calculate and return the total stipend amount based on the aggregate marks of the student using the below table.    
 * Aggregate Marks	        Bonus Stipend Amount     
 * >=85 and <90                 $10
 * >=90 and <95                 $15
 * >=95 and <=100               $20
 * Note: STIPEND is a final variable.
 * Implement the getter and setter methods appropriately.
 * Test the functionalities using the provided Tester class. 
 * Sample Input and Output
 * Input
 * Instance variable        Values
 * studentid                1212
 * aggregateMarks           93
 * 
 * Output
 * The final stipend amount of 1212 is $115.0
 * 
 * Input
 * Instance variable        Values
 * studentid                1222
 * aggregateMarks           84
 * 
 * Output
 * The final stipend amount of 122 is $100.0
 */
class Student {
    private int studentId;
    private int aggregateMarks;
    private final double STIPEND = 100;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAggregateMarks() {
        return aggregateMarks;
    }

    public void setAggregateMarks(int aggregateMarks) {
        this.aggregateMarks = aggregateMarks;
    }

    public double calculateTotalStipend() {
        double totalStipend = STIPEND;
        if (aggregateMarks >= 85 && aggregateMarks < 90) {
            totalStipend += 10;
        } else if (aggregateMarks >= 90 && aggregateMarks < 95) {
            totalStipend += 15;
        } else if (aggregateMarks >= 95 && aggregateMarks <= 100) {
            totalStipend += 20;
        }
        return totalStipend;
    }
}
public class Exercise {
    public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentId(1212);
		student1.setAggregateMarks(93);

		double totalStipend = student1.calculateTotalStipend();
		System.out.println("The final stipend of " + student1.getStudentId()+" is $" + totalStipend);

		Student student2 = new Student();
		student2.setStudentId(1222);
		student2.setAggregateMarks(84);

		totalStipend = student2.calculateTotalStipend();
		System.out.println("The final stipend of " + student2.getStudentId()+" is $" + totalStipend);
	}
}