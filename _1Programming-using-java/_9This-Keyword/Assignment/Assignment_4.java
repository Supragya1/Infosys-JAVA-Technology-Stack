/**
 * Implement a class Rectangle with the instance variables and methods mentioned below. 
 * Instance variables: length float, width float
 * Method: calculateArea() : double, calculatePerimeter() : double
 * Method Description
 * calculateArea()
 * Calculate and return the area of the rectangle. The area should be rounded off to two decimal digits.
 * calculatePerimeter()
 * Calculate and return the perimeter of the rectangle. The perimeter should be rounded off to two decimal digits.
 * Test the functionalities using the provided Tester class. 
 * Sample Input                         Expected Output
 * length: 12f, width: 5f          Area of the rectangle is 60.0
 *                                Perimeter of the rectangle is 34.0
 * 
 * length: 6f, width: 3f            Area of the rectangle is 18.0
 *                               Perimeter of the rectangle is 18.0
 */
import java.util.Scanner;
class Rectangle {
    private float length;
    private float width;
    public double calculateArea(){
        double area = length*width;
        return area;
    }
    public double calculatePerimeter(){
        double perimeter = 2*(length+width);
        return perimeter;
    }
    public void setValues(float length,float width){
        this.length = length;
        this.width = width;
    }
}

class Assignment_4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Rectangle rectangle=new Rectangle();
		float length = scan.nextFloat();
		float width = scan.nextFloat();
        rectangle.setValues(length,width);
		System.out.println("Area of the rectangle is "+rectangle.calculateArea());
		System.out.println("Perimeter of the rectangle is "+rectangle.calculatePerimeter());
        scan.close();
	}

}
