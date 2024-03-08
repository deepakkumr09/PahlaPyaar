import java.util.Scanner;
public class sumtwonumbers {
    public static void main(String[] args) {
        System.out.println("Enter the Two number :");
        
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
