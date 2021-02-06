import java.util.Scanner;
 
class payroll {

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
 
      System.out.println("Enter employee's name:");
      String employee = input.next();
 
      System.out.println("Enter number of hours worked:");
      double  hours = input.nextDouble();
 
      System.out.println("Enter hourly pay rate:");
      double  pay = input.nextDouble();
 
      double  gross_pay = pay * hours;
 
      System.out.println("Enter federal tax withholding rate:");
      double  fedtax = input.nextDouble();
      double fedtaxr = fedtax * 0.20;
 
      System.out.println("Enter state tax withholding rate:");
      double  statetax = input.nextDouble();
 
      double statetaxr = statetax * 0.20;
 
      double deductions = fedtaxr + statetaxr;
 
      double total_pay = gross_pay - deductions;
 
      System.out.println("Employee name: " + employee);
 
      System.out.println("Hours worked: " + hours);
 
      System.out.println(" Enter payrate: " + pay);
 
      System.out.println(" Enter gross pay: " + gross_pay);
 
      System.out.println(" Deductions: ");
      System.out.println("\t Federdal Withholding (15.0%): " + fedtaxr);
      System.out.println("\t State Withholding (9.0%)" + statetaxr);
      System.out.println("\t Total deductions:" + deductions);
      System.out.println("Total pay: " + total_pay);
   }
}