/**
The Metro Bank provides various types of loans such as car loans, business loans and house loans to its account holders, i.e., customers.
Implement a program to determine the eligible loan amount and the EMI that the bank can provide to
its customers based on their salary and the loan type they expect to avail.
The values required for determining the eligible loan amount and the EMI are:
* account number of the customer
* account balance of the customer
* salary of the customer
* loan type 
* expected loan amount
* expected no. of EMIs
The following validations should be performed:
* The account number should be of 4 digits and its first digit should be 1
* The customer should have a minimum balance of $1000 in the account
Display appropriate error messages if the validations fail.
If the validations pass, determine whether the bank would provide the loan or not. 
The bank would provide the loan, only if the loan amount and the number of EMIs expected by the customer 
is less than or equal to the loan amount and the number of EMIs decided by the bank respectively. 
The bank decides the eligible loan amount and the number of EMIs based on the below table.
Salary  Loan Type  Eligible Loan Amount  No. of EMIs
>25000    Car             500000                36
>50000    House           6000000               60
>75000    Business        7500000               84
Display the account number, eligible and requested loan amount and the number of EMIs if the bank provides the loan.
Display an appropriate message if the bank does not provide the loan.
Sample Input                                    Expected Output
account number: 1001
salary: 40000                                eligible loan amount: 500000
account balance: 250000                      eligible emis: 36
loan type: car
expected loan amount: 300000
emis expected: 30
 */
import java.util.*;
public class Assignment_5 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your account number");
	long account_number = scan.nextLong();
	System.out.println("Enter your account balance");
	long account_balance = scan.nextLong();
	System.out.println("Enter your salary");
    long salary = scan.nextLong();
    scan.nextLine();
    System.out.println("Enter the loan type");
    String loan_type = scan.nextLine();
    System.out.println("Enter the expected loan amount?");
    long expected_loan_amount = scan.nextLong();
    System.out.println("Enter the expected emis");
    long expected_emi = scan.nextLong();
    long eligible_loan_amount = 0;
    long eligible_emi = 0;
    if(account_number<1000 || account_number>1999){
        System.out.println("Invalid account number");
    }
    else if(account_balance<1000){
        System.out.println("Insufficient balance");
    }
    else if(salary>25000 && loan_type.equalsIgnoreCase("car") && expected_loan_amount<=500000 && expected_emi<=36){
        eligible_loan_amount = 500000;
        eligible_emi = 36;
        System.out.println("Eligible loan amount: "+eligible_loan_amount);
        System.out.println("Eligible emis: "+eligible_emi);
    }
    else if(salary>50000 && loan_type.equalsIgnoreCase("house") && expected_loan_amount<=6000000 && expected_emi<=60){
        eligible_loan_amount = 6000000;
        eligible_emi = 60;
        System.out.println("Eligible loan amount: "+eligible_loan_amount);
        System.out.println("Eligible emis: "+eligible_emi);
    }
    else if(salary>75000 && loan_type.equalsIgnoreCase("business") && expected_loan_amount<=7500000 && expected_emi<=84){
        eligible_loan_amount = 7500000;
        eligible_emi = 84;
        System.out.println("Eligible loan amount: "+eligible_loan_amount);
        System.out.println("Eligible emis: "+eligible_emi);
    }
    else{
        System.out.println("You are not eligible for the loan");
    }
	}
}

