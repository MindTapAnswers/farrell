import java.util.Scanner;
public class ShadyRestRoom2
{
   public static void main (String args[])
   {
      int selection;
      int lakesel;
      int price;
      String result;
      final int QUEEN = 1, KING = 2, SUITE = 3, LAKE = 1, PARK = 2;
      final int QPRICE = 125, KPRICE = 139, SPRICE = 165;
      final String QSTRING = "Queen bed", KSTRING = "King bed",
         SSTRING = "Suite with a king bed and pull-out couch",
         LSTRING = "Lake view", PSTRING = "Park view",
         INVALIDSTRING = "an invalid option";
      Scanner in = new Scanner(System.in);
      System.out.println("\t\n\nMenu\n");
      System.out.println("(" + QUEEN + ") " + QSTRING);
      System.out.println("(" + KING + ") " + KSTRING);
      System.out.println("(" + SUITE + ") " + SSTRING);
      System.out.print("Enter Selection (1, 2, or 3) >> ");
      selection = in.nextInt();
      if(selection == QUEEN)
      {
         result = QSTRING;
         price = QPRICE;
      }
      else
         if(selection == KING)
         {
            result = KSTRING;
            price = KPRICE;
         }
         else
            if (selection == SUITE)
            {
                result = SSTRING;
                price = SPRICE;
            }
            else
            {
                result = INVALIDSTRING;
                price = 0;
             }
       if(price != 0)
      {
            Scanner ding = new Scanner(System.in);
          System.out.println("\t\nSelect View\n");
      System.out.println("(" + LAKE + ") " + LSTRING);
      System.out.println("(" + PARK + ") " + PSTRING);
      System.out.print("Enter Selection (1, 2) >> ");
           lakesel = in.nextInt();
          if(lakesel == LAKE)
          {
              price += 15;
          } else if(lakesel == PARK){
              price = price;
          } else {
              result = INVALIDSTRING;
              price += 15;
          }
      }
      System.out.println("You selected " + result + "  $" + price);
   }
}
