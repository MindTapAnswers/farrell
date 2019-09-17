import java.util.Scanner;
class MileConversionsInteractive
{
   public static void main(String[] args) {
      // Modify the code below
      System.out.println("Please enter the number of miles you wish to convert to inches, feet, yards");
      final double INCHES_IN_MILE = 63360;
      final double FEET_IN_MILE = 5280;
      final double YARDS_IN_MILE = 1760;
      double miles;
        Scanner UserInput = new Scanner(System.in);
        miles = UserInput.nextDouble();
      double in, ft, yds;
      in = miles * INCHES_IN_MILE;
      ft = miles * FEET_IN_MILE;
      yds = miles * YARDS_IN_MILE;
      System.out.println(miles + " miles is " + in + 
         " inches, or " + ft + " feet, or " + 
         yds + " yards");
   }
}
