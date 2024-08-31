package Dacjava;
//import java.util.Scanner;
public class FibonacciArray {
   public static void main(String[] args) {
	        int arr[]=new int[9];
			int i;
			
			 arr[0] = 0;
			 arr[1] = 1;
			System.out.println(arr[0]+ " " +arr[1]);
			for( i=2;i<9;i++) {
				arr[i]=arr[i-1]+arr[i-2];
				System.out.println(" "+arr[i]);
				//arr[i-1]=arr[i-2];
				//arr[i-2]=arr[i];
				
			}
			
			

		}

	}


