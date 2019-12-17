import java.util.*;
public class AcmePay {
    public static void main(String[] args) throws Exception {
        Scanner spoon = new Scanner(System.in);
        int shift, reti = 2;
        double rate = 0, pay = 0, ovrtm = 0, total = 0, hrs = 0, dede = 0, net = 0;

        System.out.print("What is your shift? > ");
        shift = spoon.nextInt();
        System.out.print("How many hours did you work? > ");
        hrs = spoon.nextInt();
       if (shift == 1){
           rate = 17;}
           else{
               if(shift == 2){
                   rate = 18.50;
               System.out.println("Do you want to join the retirement program?  1 = yes, 2 = no");
        reti = spoon.nextInt();}
               else{
                   if(shift == 3){
                       rate = 22;
                   System.out.println("Do you want to join the retirement program?  1 = yes, 2 = no");
        reti = spoon.nextInt();}
                   else{
                       System.out.println("Reselect your shift.");}}}
        
        if(hrs > 40){
            pay = 40 * rate;
            ovrtm = (hrs-40) * (rate*1.5);}
        else{pay = hrs * rate;}
        
        total = pay + ovrtm;
        
        if(reti == 1){
            dede = (total * .03);
            net = total - dede;}
        else{net = total;}
            
        System.out.println("Hours worked: " +hrs);
        System.out.println("Shift: " +shift);
        System.out.println("Hourly pay rate: " +rate  );
        System.out.println("Regular pay: " +pay);
        System.out.println("Overtime pay: " +ovrtm);
        System.out.println("Total pay: " + total);
        System.out.println("Retirement deduction: " +dede );
        System.out.println("Net pay: " + net);
    }
}

