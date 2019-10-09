import java.time.*;
public class TenThousandDaysOld
{
   public static void main(String[] args)
   {
      LocalDate birthday = LocalDate.of(2000,1, 1);
      final int FACTOR = 10000;
      System.out.println("I will be " + FACTOR + " days old on " +
        birthday.plusDays(FACTOR));
   }
}
