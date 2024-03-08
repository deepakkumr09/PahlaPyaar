/* Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
 */

 import java.util.*;
public class Gst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil :");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of pen :");
        float pen = sc.nextFloat();
        System.out.println("Enter the cost of eraser :");
        float eraser = sc.nextFloat();
        float bill1 = pencil + pen + eraser;
        float bill2 = (bill1*18)/100;
        float bill = bill1+bill2;
        System.out.println("Bill of all item is after GST ");
        System.out.println(bill);

        int $ = 24;
        System.out.println($);


    }
    
}
