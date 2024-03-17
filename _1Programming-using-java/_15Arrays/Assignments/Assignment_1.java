/**
 * Implement the class Teacher based on the class diagram and description given below.
 * Method Description
 * Teacher(String teacherName, String subject, double salary)
 * Initialize the values of all the instance variables appropriately with the values passed
 * Create a Tester class. Create 4 objects of Teacher class. Create an array of type Teacher 
 * store the created objects and display the details of the teachers.
 *      Input                           Expected Output
 * Teacher object1
 * teacher ,subject, salary           
 * Alex,Java Fundamentals, 1200L        Name: Alex,Subject: Java Fundamentals,Salary: 1200.0
 */
class Teacher{
    private String teacherName;
    private String subject;
    private double salary;
    public Teacher(String teacherName, String subject, double salary){
        this.teacherName = teacherName;
        this.subject = subject;
        this.salary = salary;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}
public class Assignment_1 {
    public static void main(String[] args) {
        Teacher[] teachers = new Teacher[4];
        teachers[0] = new Teacher("Alex", "Java Fundamentals", 1200);
        teachers[1] = new Teacher("John", "Python", 1500);
        teachers[2] = new Teacher("Smith", "C++", 1300);
        teachers[3] = new Teacher("David", "Data Structures", 1400);
        for (Teacher teacher : teachers) {
            System.out.println("Name: " + teacher.getTeacherName() + ", Subject: " + teacher.getSubject() + ", Salary: " + teacher.getSalary());
        }                                                                                                           
	}
}
