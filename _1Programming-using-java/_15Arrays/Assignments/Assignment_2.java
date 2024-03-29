/**
 * Find and return the average salary, number of salaries greater than the average salary and number of 
 * salaries lesser than the average salary from the salary array passed to the findDetails() method. 
 * Return a double array containing average salary in index position 0, number of salaries greater than 
 * the average salary in index position 1 and number of salaries lesser than the average salary in index position 2. 
 * Implement the logic inside findDetails() method.
 * Test the functionalities using the main method of the Tester class.
 * Sample Input                                 Expected Output
 * {23500.0,25080.0,28760.0,22340.0,19890.0}     {23914.0, 2, 3}
 */
public class Assignment_2{
    public static double[] findDetails(double[] salary) {
        int sum=0;
        int len=salary.length;
        for(int i=0;i<len;i++){
            sum+=salary[i];
        }
        double avg=sum/len;
        double less=0,more=0;
        for(int i=0;i<len;i++){
            if(salary[i]>avg){
                more++;
            }
            else{
                less++;
            }
        }
        return new double[]{avg,more,less};   
    }
    public static void main(String[] args) {
        double[] salary = { 23500.0, 25080.0, 28760.0, 22340.0, 19890.0 };
        double[] details = findDetails(salary);
        System.out.println("Average salary: "+ details[0]);
        System.out.println("Number of salaries greater than the average salary: "+ details[1]);
        System.out.println("Number of salaries lesser than the average salary: "+ details[2]);
    }
}