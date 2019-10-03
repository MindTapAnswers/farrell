import java.util.Scanner;
public class InchConversion {
    public static void main (String args[]) {
        int aValue;
     Scanner input = new Scanner(System.in);
     System.out.print("Enter an integer >> ");
     aValue = input.nextInt();
     convertToFeet(aValue);
     convertToYards(aValue);
    }

    public static void convertToFeet(int inches) {
     double feet;
     final double FOOT_FACTOR = 12;
     feet = inches / FOOT_FACTOR;
     System.out.println(inches + " inches is " + feet + " feet");
    }
    public static void convertToYards(int inches) {
     double yards;
     final double YARD_FACTOR = 36;
     yards = inches / YARD_FACTOR;
     System.out.println(inches + " inches is " + yards + " yards");
    }
}
