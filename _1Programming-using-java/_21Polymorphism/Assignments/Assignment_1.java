/**
 * A construction company wants to keep a record of the employees working in it. 
 * There are permanent employees as well as contract employees. Contract employees work on an hourly basis whereas 
 * permanent employees are paid monthly salary. An application needs to be developed for the company for storing the 
 * employee details.
 * Implement the classes based on the class diagram and description given below.
 * Method Description 
 * Employee
 * Employee(int employeeId, String employeeName)
 * Initialize the employeeId and employeeName instance variables appropriately with the values passed to the constructor.
 * Implement the getter and setter methods appropriately.
 * PermanentEmployee
 * PermanentEmployee(int empId, String name, double basicPay, double hra, float experience)
 * Initialize the employeeId, employeeName, basicPay, hra and experience instance variables appropriately 
 * with the values passed to the constructor.
 * calculateMonthlySalary()
 * Calculate and set the salary of the employee using the formula given below.
 * salary = basic pay + hra + variable component
 * Variable component is calculated based on the employee's experience according to the table given below.
 * Experience (in years)	% of basic pay
 * < 3 	                        0
 * >= 3 and < 5         	    5
 * >= 5 and < 10         	    7
 * >= 10 	                    12
 * Note: Set the calculated salary after rounding off using the Math.round(double a) method.
 * Implement the getter and setter methods appropriately.
 * ContractEmployee
 * ContractEmployee(int empId, String name, double wage, float hoursWorked)
 * Initialize the employeeId, employeeName, wage and hoursWorked instance variables 
 * appropriately with the values passed to the constructor.
 * calculateSalary()
 * Calculate the salary of the employee using the formula given below.
 * salary = hoursWorked * wage
 * Implement the getter and setter methods appropriately.
 * Test the functionalities using the provided Tester class. 
 * Input and Output       
 * For PermanentEmployee                                                      
 * Input 
 * Instance variables	    Values
 * employeeId	            711211
 * employeeName	            Rafael
 * basicPay	                $1855
 * hra                      $115
 * experience	             3.5
 * Output
 * Hi Rafael, your salary is $2063.0
 */
class Employee {
    private int employeeId;
    private String employeeName;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
}
class PermanentEmployee extends Employee {
    private double basicPay;
    private double hra;
    private float experience;
    private double salary;

    public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
        super(empId, name);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
    }

    public void calculateMonthlySalary() {
        if (experience < 3) {
            salary = basicPay + hra;
        } else if (experience >= 3 && experience < 5) {
            salary = basicPay + hra + (basicPay * 5 / 100);
        } else if (experience >= 5 && experience < 10) {
            salary = basicPay + hra + (basicPay * 7 / 100);
        } else {
            salary = basicPay + hra + (basicPay * 12 / 100);
        }
        salary = Math.round(salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
class ContractEmployee extends Employee {
    private double wage;
    private float hoursWorked;
    private double salary;

    public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
        super(empId, name);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public void calculateSalary() {
        salary = hoursWorked * wage;
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
        PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1855, 115, 3.5f);
	    permanentEmployee.calculateMonthlySalary();
	    System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+permanentEmployee.getSalary());
	    ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
	    contractEmployee.calculateSalary();
	    System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+contractEmployee.getSalary());
    }
}
