import java.util.*;
public class EvenEntryLoop {
    public static void main (String args[]) {
        Scanner nom = new Scanner(System.in);
        boolean e = false;
        while(e == false){
        System.out.println("Enter even number - ");
        int num = nom.nextInt();
         if(num % 2 == 0){
             System.out.println("Good job!");
             e = true;
         } else {
             if(num == 999){
                 System.exit(0);
             } else {
                 System.out.println(num + " is not an even number");
             }
         }
        }
    }
}
