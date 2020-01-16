import java.util.Scanner;
public class CountByAnything
{
   // Modify the code below
   public static void main (String args[])
   {
       Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
      final int START = num;
      final int STOP = 500;
      final int NUMBER_PER_LINE =10;
      int count = 0;
      for(int i = START; i <= STOP; i += START)
      {
         System.out.print(i + "  ");
         count+=1;
           if(count == 10) {
  count = 0;
  System.out.println();
           }}}}

