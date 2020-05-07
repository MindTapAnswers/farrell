public class Purchase
{
   private double invoiceNumber;
   private double saleAmount;
   private double tax;
   private static final double RATE = 0.05;
   public void setInvoiceNumber(double num)
   {
      invoiceNumber = num;
   }
   public void setSaleAmount(double amt)
   {
      saleAmount = amt;
      tax = saleAmount * RATE;
   }
   public double getSaleAmount()
   {
      return saleAmount;
   }
   public double getInvoiceNumber()
   {
      return invoiceNumber;
   }
   public void display()
   {
      System.out.println("Invoice #" + invoiceNumber +
         "  Amount of sale: $" + saleAmount + "  Tax: $" + tax);
   }
}
