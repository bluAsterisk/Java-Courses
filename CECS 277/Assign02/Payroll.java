class Payroll
{
  public static void main(String argv[])
  {
    double pay = 25.00;
    double hoursWorked = 40.00;
    double grossPay = pay * hoursWorked;
    double taxesWithheld = grossPay * .15;
    double netPay = grossPay - taxesWithheld;
    System.out.println("Pay: " + pay);
    System.out.println("Hours worked: " + hoursWorked);
    System.out.println("Gross pay: " + grossPay);
    System.out.println("Taxes withheld: " + taxesWithheld);
    System.out.println("Net pay: " + netPay);
  }
}
