import java.util.Scanner;
public class ShadyRestRoom
{
   public static void main (String args[])
   {
      int selection;
      int price;
      String result;
      final int QUEEN = 1, KING = 2, SUITE = 3;
      final int QUEEN_PR = 125, KING_PR = 139,
         SUITE_PR = 165;
      final String QUEEN_STR = "Queen",
                   KING_STR = "King",
                   SUITE_STR = "Suite with king bed and pullout couch",
                   INVALID_STR = "You selected an invalid option";
      Scanner in = new Scanner(System.in);
      System.out.println("\t\n\nMenu\n");
      System.out.println("(" + QUEEN + ") " + QUEEN_STR);
      System.out.println("(" + KING + ") " + KING_STR);
      System.out.println("(" + SUITE + ") " + SUITE_STR);
      System.out.print("Enter Selection (1, 2, or 3)>> ");
      selection = in.nextInt();
      if(selection == QUEEN)
      {
         result = QUEEN_STR;
         price = QUEEN_PR;
      }
      else
         if(selection == KING)
         {
            result = KING_STR;
            price = KING_PR;
         }
         else
            if (selection == SUITE)
            {
                result = SUITE_STR;
                price = SUITE_PR;
            }
            else
            {
                result = INVALID_STR;
                price = 0;
             }
      System.out.println("You selected " + result + "  $" + price);
   }
}
