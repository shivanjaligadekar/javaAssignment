package Dacjava;

import java.util.Arrays;

public class ArrayAscendDescend {

	public static void main(String[] args) {
		int arr[]= {4,5,6,7,8,9,81,76,12};
		// System.out.println(arr.length);
		int i;
		Arrays.sort(arr);
		int start=arr.length/2;
		int end=arr.length-1;
     while(start<end) {
    	 int temp=arr[start];
    	 arr[start]=arr[end];
    	 arr[end]=temp;
    	 start++;
    	 end--;
    	 
        	
        }
     for(i=0;i<=arr.length;i++)
     {
    	 System.out.println(arr[i]);
     }
	}
	

}
