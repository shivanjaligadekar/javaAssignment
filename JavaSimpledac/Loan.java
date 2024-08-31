

import java.util.Scanner;

class Loan
{
public static void main (String args[])
{

Scanner obj=new Scanner(System.in);
double p,r,n,amt,emi,emiamt;
System.out.println("Enter value for p r and n");
p=obj.nextDouble();
r=obj.nextDouble();
n=obj.nextDouble();
amt=p*r*n/100;
System.out.println("Pay_Loan_amt is=" +amt);

emi=n*12;
System.out.println("EMI  is=" +emi);

emiamt=amt/emi;
System.out.println("EMI_amt is=" +emiamt);


}
}