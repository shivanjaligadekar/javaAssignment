package dac;
import java.util.Scanner;
public class While_Demo {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=1,n,sum=0;
			float avg;
	System.out.println("Enter 5 numbers");
	
	while(a<=5)
	{

		
		n=sc.nextInt();
		sum=sum+n;
		//sum=sc.nextInt();
		//System.out.println(a);
		a++;
		
	}
	
	avg=sum/5;
	System.out.println("Sum of 5 numbers="+sum);
	System.out.println("Average="+avg);
	
	}

}
