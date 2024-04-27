/**
 * The Triangle class is used for representing triangles. 
 * The vertices of the triangle will be represented using the Point class created in Method Overloading - Exercise 1.
 * Implement the class Triangle based on the class diagram and description given below.
 * Method Description
 * Triangle()
 * Initialize the instance variables point1, point2 and point3 with the following coordinate values
 * point1 - 0, 0
 * point2 - 1, 1 
 * point3 - 2, 5
 * Triangle(double point1XCoordinate, double point1YCoordinate, double point2XCoordinate, double point2YCoordinate, 
 * double point3XCoordinate, double point3YCoordinate)
 * Initialize the instance variables point1, point2 and point3 with the following coordinate values
 * point1 - point1XCoordinate, point1YCoordinate
 * point2 - point2XCoordinate, point2YCoordinate 
 * point3 - point3XCoordinate, point3YCoordinate
 * Triangle(Point point1, Point point2, Point point3)
 * Initialize the instance variables point1, point2 and point3 appropriately with the values passed to the constructor
 * calculatePerimeter()
 * Calculates and return the perimeter of the triangle using the formula given below.
 * perimeter=a+b+c, where a, b and c are the lengths of each side of the triangle 
 * calculateArea()
 * Calculate and return the area of the triangle using the formula given below
 * area=√(s(s-a)(s-b)(s-c)), where a, b and c are the lengths of each side of the triangle and s=(a+b+c)/2 
 * NOTE: perimeter and area should be rounded off to 2 decimal digits.
 * Hint
 * Use Math.sqrt(double d) method to calculate the square root.
 * Implement the getter and setter methods appropriately.
 * Test the functionalities using the provided Tester class.
 * Sample Input and Output
 * Input
 * Triangle object - triangle1 (created using parameterless construtor) 
 * Output
 * Perimeter of triangle1 is 10.92
 * Area of triangle1 is 1.44
 * Input
 * Triangle object - triangle2 (created using Triangle(double point1XCoordinate, double point1YCoordinate, 
 * double point2XCoordinate, double point2YCoordinate, double point3XCoordinate, double point3YCoordinate)) 
 * Instance variables               Values
 * point1XCoordinate                 1
 * point1YCoordinate                 2
 * point2XCoordinate                 6
 * point2YCoordinate                 5
 * point3XCoordinate                 5
 * point3YCoordinate                 1
 * Output
 * Perimeter of triangle2 is 14.07
 * Area of triangle2 is 8.49
 * Input
 * Instance variables               Values
 * point1                           (2,1)
 * point2                           (4,4)
 * point3                           (9,1)
 * Output
 * Perimeter of triangle3 is 16.44
 * Area of triangle3 is 10.51
 * 
 */
class Point {
    private double xCoordinate;
    private double yCoordinate;

    public Point(double xCoordinate, double yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(double xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public double getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(double yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
}
class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle() {
        this.point1 = new Point(0, 0);
        this.point2 = new Point(1, 1);
        this.point3 = new Point(2, 5);
    }

    public Triangle(double point1XCoordinate, double point1YCoordinate, double point2XCoordinate, double point2YCoordinate, double point3XCoordinate, double point3YCoordinate) {
        this.point1 = new Point(point1XCoordinate, point1YCoordinate);
        this.point2 = new Point(point2XCoordinate, point2YCoordinate);
        this.point3 = new Point(point3XCoordinate, point3YCoordinate);
    }

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double calculatePerimeter() {
        double a = Math.sqrt(Math.pow(point1.getxCoordinate() - point2.getxCoordinate(), 2) + Math.pow(point1.getyCoordinate() - point2.getyCoordinate(), 2));
        double b = Math.sqrt(Math.pow(point2.getxCoordinate() - point3.getxCoordinate(), 2) + Math.pow(point2.getyCoordinate() - point3.getyCoordinate(), 2));
        double c = Math.sqrt(Math.pow(point3.getxCoordinate() - point1.getxCoordinate(), 2) + Math.pow(point3.getyCoordinate() - point1.getyCoordinate(), 2));
        return Math.round((a + b + c) * 100.0) / 100.0;
    }

    public double calculateArea() {
        double a = Math.sqrt(Math.pow(point1.getxCoordinate() - point2.getxCoordinate(), 2) + Math.pow(point1.getyCoordinate() - point2.getyCoordinate(), 2));
        double b = Math.sqrt(Math.pow(point2.getxCoordinate() - point3.getxCoordinate(), 2) + Math.pow(point2.getyCoordinate() - point3.getyCoordinate(), 2));
        double c = Math.sqrt(Math.pow(point3.getxCoordinate() - point1.getxCoordinate(), 2) + Math.pow(point3.getyCoordinate() - point1.getyCoordinate(), 2));
        double s = (a + b + c) / 2;
        return Math.round(Math.sqrt(s * (s - a) * (s - b) * (s - c)) * 100.0) / 100.0;
    }
}

public class Assignment_3 {
    public static void main(String[] args) {
		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle(1, 2, 6, 5, 5, 1);
		
		Point point1 = new Point(2, 1);
		Point point2 = new Point(4, 4);
		Point point3 = new Point(9, 1);
		Triangle triangle3 = new Triangle(point1, point2, point3);		
		
		System.out.println("Perimeter of triangle1 is "+triangle1.calculatePerimeter());
		System.out.println("Area of triangle1 is "+triangle1.calculateArea());
		
		System.out.println("Perimeter of triangle2 is "+triangle2.calculatePerimeter());
		System.out.println("Area of triangle2 is "+triangle2.calculateArea());
		
		System.out.println("Perimeter of triangle3 is "+triangle3.calculatePerimeter());
		System.out.println("Area of triangle3 is "+triangle3.calculateArea());
	}
}
