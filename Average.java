import java.util.*;
public class Average {
    public static void main(String[] args) {
        System.out.println("Enter the 3 numbers :");
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        float avg = (a + b + c) /3;
        System.out.println(avg);
        

    }
    
}
