/**
 * Anchor College offers both graduate and postgraduate programs. The college stores the names of the students, 
 * their test scores and the final result for each student. Each student has to take 4 tests in total. 
 * You need to create an application for the college by implementing the classes based on the class diagram 
 * and description given below.
 * Method Description
 * Student
 * Student(String studentName)
 * Initialize the instance variable studentName with the value passed to the constructor and other 
 * instance variables to the default values.
 * setTestScore(int testNumber, int testScore)
 * Set the value of the testScore in the appropriate position of testScores array based on the testNumber.
 * Implement the getter and setter methods appropriately.
 * UndergraduateStudent
 * UndergraduateStudent(String studentName)
 * Initialize the instance variable studentName with the value passed to the constructor and other 
 * instance variables to the default values.
 * generateResult()
 * Implement the abstract method of Student class by setting the value of testResult based on the below details.  
 * Average              Result
 * >= 90                "Pass"
 * <60                  "Fail"
 * GraduateStudent
 * GraduateStudent(String studentName)
 * Initialize the instance variable studentName with the value passed to the constructor and other instance 
 * variables to the default values.
 * generateResult()
 * Implement the abstract method of Student class by setting the value of testResult based on the below details.
 * Average              Result
 * >= 70                "Pass"
 * <70                  "Fail"
 * Test the functionalities using the provided Tester class.
 * Sample Input and Output
 * For UndergraduateStudent
 * Input
 * Instace variable         Values
 * name                     "philp"
 * testScores               {70,69,71,55}
 * Output
 * Student name: Philip
 * Result: Pass
 * For GraduateStudent
 * Instance variables           Values
 * name                          Jerry
 * testScores                    {70,69,71,55}
 * Output
 * Student name: Jerry
 * Result : Fail
 */
abstract class Student {
    private String studentName;
    private int[] testScores = new int[4];
    private String testResult;
    
    public Student(String studentName) {
        this.studentName = studentName;
    }
    
    public String getStudentName() {
        return studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    public int[] getTestScores() {
        return testScores;
    }
    
    public void setTestScores(int[] testScores) {
        this.testScores = testScores;
    }
    
    public String getTestResult() {
        return testResult;
    }
    
    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    public abstract void generateResult();
}
class UndergraduateStudent extends Student {
    public UndergraduateStudent(String studentName) {
        super(studentName);
    }
    public void setTestScore(int testNumber, int testScore) {
        getTestScores()[testNumber] = testScore;
    }
    public void generateResult() {
        int sum = 0;
        for(int i = 0; i < getTestScores().length; i++) {
            sum += getTestScores()[i];
        }
        int average = sum / getTestScores().length;
        if(average >= 90) {
            setTestResult("Pass");
        } else if(average < 60) {
            setTestResult("Fail");
        }
    }
}
class GraduateStudent extends Student {
    public GraduateStudent(String studentName) {
        super(studentName);
    }
    public void setTestScore(int testNumber, int testScore) {
        getTestScores()[testNumber] = testScore;
    }
    
    public void generateResult() {
        int sum = 0;
        for(int i = 0; i < getTestScores().length; i++) {
            sum += getTestScores()[i];
        }
        int average = sum / getTestScores().length;
        if(average >= 70) {
            setTestResult("Pass");
        } else if(average < 70) {
            setTestResult("Fail");
        }
    }
}
public class Exercise {

    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);
            
        undergraduateStudent.generateResult();
            
        System.out.println("Student name: "+undergraduateStudent.getStudentName());
        System.out.println("Result: "+undergraduateStudent.getTestResult());
            
        System.out.println();
            
        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);
            
        graduateStudent.generateResult();
            
        System.out.println("Student name: "+graduateStudent.getStudentName());
        System.out.println("Result : "+graduateStudent.getTestResult());
    }
}