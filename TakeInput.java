import java.util.*;
public class TakeInput {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter repeatation");
        int n=sc.nextInt();
        // int n=7;
        String name = sc.nextLine();
        
        
      
        int counter=1;


       
        do{

            
            System.out.println(name);
            counter++;
        }while(counter<=n);
    }
}