/**
 * Implement the class Bill based on the class diagram and description given below.
 * Method Description
 * Bill(String paymentMode)
 * Initialize the paymentMode instance variable with the value passed to the parameter. 
 * Generate the billId using counter. The value of billId should start from 'B9001' and the numerical part should be 
 * incremented by 1 for the subsequent values. Initialize the counter in static block.
 * Implement the appropriate getter and setter methods.
 * Test the functionalities using the provided Tester class. Create two or more Bill objects and validate that the 
 * billId is being generated properly.
 * Sample Input and Output
 * For constructor
 * Input
 * For first Bill object
 * Parameters: Values
 * paymentMode: "Debit"
 * For second Bill object
 * paymentMode: "PayPal"
 * Output
 * Bill Details
 * Bill Id: B9001
 * Payment Mode: Debit
 * 
 * Bill Details
 * Bill Id: B9002
 * Payment Mode: PayPal
 */
class Bill{
    private String paymentMode;
    private String billId;
    private static int counter = 9001;

    static {
        counter = 9001;
    }

    public Bill(String paymentMode) {
        this.paymentMode = paymentMode;
        this.billId = "B" + counter++;
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }
}

class Tester {
    public static void main(String[] args) {

        Bill bill1 = new Bill("DebitCard");
        Bill bill2 = new Bill("PayPal");

        Bill[] bills = { bill1, bill2 };

        for (Bill bill : bills) {
            System.out.println("Bill Details");
            System.out.println("Bill Id: " + bill.getBillId());
            System.out.println("Payment method: " + bill.getPaymentMode());
            System.out.println();
        }
    }
}

