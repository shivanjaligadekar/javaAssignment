package Dacjava;
import java.util.Scanner;
public class HarshadNumber {

	public static void main(String[] args) {
		int num,sum=0;
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		int temp=num;
		while(temp>0) {
			sum=sum+temp%10;
			temp=temp/10;
		}
		if(num%sum==0)
			System.out.println("Harshad Number");
		else 
			System.out.println("Not a Harshad Number");

	}

}
