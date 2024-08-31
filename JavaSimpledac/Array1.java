package dac;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int a[],i,sum=0;
float avg;
System.out.println("Enter numbers");
a=new int[5];
	for(i=0;i<=4;i++)
	{
	   a[i]=sc.nextInt();
	}
	for(i=0;i<4;i++)
	{
	   System.out.println("a["+i+"]="+a[i]);
	   sum=sum+a[i];
	}
	
	System.out.println("sum="+sum);
	avg=sum/5;
	System.out.println("Average="+avg);
	
  }

}
