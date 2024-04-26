/**
 * The Bill class is used to find the price of items for calculation. 
 * Implement a class Bill based on the class diagram and description given below.
 * The details of the items are given below.
 * Brand Name       Item Id         Item Type       Size        Price
 * Puma              1001            T-Shirt         34         $25
 *                                                   36 
 *                   1002            Skirt           38         $20
 *                                                   40
 * Reebok            1003            T-Shirt         34         $23
 *                                                   36
 *                   1004            Skirt           38         $18
 *                                                   40
 * Method Description
 * findPrice(int itemId)
 * Find and return the price based on the itemId using the table given above.
 * If the itemId passed to method is invalid, return the price as 0.
 * findPrice(String brandName, String itemType, int size)
 * Find and return the price based on the brandName, itemType and size using the table given above.
 * If any invalid details are passed to the method, return the price as 0.
 * Test the functionalities using the provided Tester class.
 * Sample Input and Output
 * For findPrice(int itemId)
 * Input
 * Attributes               Value
 * ItemId                   1001
 * 
 * Output
 * Price of the selected item: $25
 * For findPrice(String brandName, String itemType, int size)
 * Input
 * Instance Variables       Value
 * brandName                Reebok
 * itemType                 T-shirt
 * size                     34
 * Output
 * Price of the selected item: $23
 */
class Bill{
    public double findPrice(int itemId){
        double price = 0;
        if(itemId == 1001){
            price = 25;
        }
        else if(itemId == 1002){
            price = 20;
        }
        else if(itemId == 1003){
            price = 23;
        }
        else if(itemId == 1004){
            price = 18;
        }
        return price;
    }
    public double findPrice(String brandName, String itemType, int size){
        double price = 0;
        if(brandName.equals("Puma") && itemType.equals("T-shirt") && (size == 34 || size == 36)){
            price = 25;
        }
        else if(brandName.equals("Puma") && itemType.equals("Skirt") && (size == 38 || size == 40)){
            price = 20;
        }
        else if(brandName.equals("Reebok") && itemType.equals("T-shirt") && (size == 34 || size == 36)){
            price = 23;
        }
        else if(brandName.equals("Reebok") && itemType.equals("Skirt") && (size == 38 || size == 40)){
            price = 18;
        }
        return price;
    }
}

public class Assignment_2 {
    public static void main(String[] args) {
		
		Bill bill = new Bill();
		
		double price = bill.findPrice(1001);
		if(price>0){
		System.out.println("Price of the selected item is $"+price);
        }
		else{
		System.out.println("The Item Id is invalid");
        }
		price = bill.findPrice("Reebok","T-shirt",34);
		if(price>0){
		System.out.println("Price of the selected item is $"+price);
        }
		else{
		System.out.println("The values are not valid");
        }
	}
}
