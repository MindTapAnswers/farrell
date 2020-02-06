import java.util.Scanner;
public class CarCareChoice
{
   public static void main (String[] args)
   {
      boolean isMatch = false;
      String[] items =  { "oil change", "tire rotation",
         "battery check", "brake inspection"};
      int[] prices = {25, 22, 15, 5};
      int x;
      int matchIndex = 0;
      Scanner in = new Scanner(System.in);
      String menu = "Enter selection:";
      for(x = 0; x < items.length; ++x)
        menu += "\n   " + items[x];
     System.out.println(menu);
      String selection = in.nextLine();
      for (x = 0; x < items.length; x++)
      if(selection.equals(items[x]))
      {
	  isMatch = true;
	  matchIndex = x;
      }
      if(isMatch)
          System.out.println(selection + " price is $" + prices[matchIndex]);
      else
        System.out.println("Invalid entry");
  }
}
