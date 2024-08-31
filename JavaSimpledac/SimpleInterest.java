

import java.util.Scanner;

class SimpleInterest 
{
public static void main (String args[])
{

Scanner obj=new Scanner(System.in);
float p,r,n,amt,si;
System.out.println("Enter value for p r and n");
p=obj.nextFloat();
r=obj.nextFloat();
n=obj.nextFloat();
si=p*r*n/100;
amt=p+si;
System.out.println("Simple interest is=" +si);
System.out.println("Amount  is=" +amt);

}
}