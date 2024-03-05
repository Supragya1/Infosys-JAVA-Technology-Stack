/**
 * Consider the class Employee given below for representing employees of an organization. 
 * It has 5 different instance variables and a method to calculate the total salary based on the jobLevel.
 * Salary is calculated in the calculateSalary() method.
 * Make necessary changes to the class by making all the attributes private and by adding necessary 
 * accessor and mutator methods thus bringing in Encapsulation.
 */

class Employee {

    private String employeeId;
	private String employeeName;
	private int salary;
	private int bonus;
	private int jobLevel;

	public void calculateSalary() {
		if (this.jobLevel >= 4) {
			this.bonus = 100;
		} else {
			this.bonus = 50;
		}
		this.salary += this.bonus;
	}
	public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
	}
	public void setSalary(int salary){
        this.salary = salary;
	}
	public void setJobLevel(int jobLevel){
        this.jobLevel = jobLevel;
	}
	public String getEmployeeId(){
        return employeeId;
	}
	public String getEmployeeName(){
        return employeeName;
	}
	public int getSalary(){
        return salary;
	}
}

public class Exercise {

	public static void main(String args[]) {
		Employee employee = new Employee();
        employee.setEmployeeId("C101");
        employee.setEmployeeName("Steve");
        employee.setSalary(650);
        employee.setJobLevel(4);
		employee.calculateSalary();

		System.out.println("Employee Details");
		System.out.println("Employee Id: " + employee.getEmployeeId());
		System.out.println("Employee Name: " + employee.getEmployeeName());
		System.out.println("Salary: " + employee.getSalary());

	}
}