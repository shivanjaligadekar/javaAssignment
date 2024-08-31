package Assignment2;

import java.util.Scanner;

public class Numbers {
	private int numOne,numTwo;
	private String result;
	
	Scanner sc=new Scanner(System.in);
	int[] arr=new int[2];
	numOne
	
	public void accepNumber() {
		System.out.println("Enter 2 no");
		for(int i=0;i<2;i++) {
			arr[i]=sc.nextInt();
		}
	}
	public void calTotal() {
		System.out.println("displaying the array");
		for(int i=0;i<2;i++) {
		System.out.println(arr[i]);	
		sum+=arr[i];
	}
	}

	public static void main(String[] args) {
		

	}

}
