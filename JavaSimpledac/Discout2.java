

import java.util.Scanner;

class Discout2 
{
public static void main (String args[])
{

Scanner obj=new Scanner(System.in);
String name;
double rate,amt, disc;
int qt;

System.out.println("Enter Product name rate and quantity:");
name=obj.next();
rate=obj.nextDouble();
qt=obj.nextInt();
amt=rate*qt;
System.out.println("Amount is=" +amt);
disc=(amt*10)/100;

System.out.println("discount Amount  is=" +disc);

}
}