package Dacjava;

public class ArraySorting {

	public static void main(String[] args) {
		int i,j,temp=0;
		int arr[]= {4,8,2,7,6,5};
		for(i=5;i>=0;i--) {
			for(j=i-1;j>=0;j--) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<=5;i++) {
			System.out.println("arr["+i+"]=" +arr[i]);
			
		}
		System.out.println("Secont maximum="+arr[1]);
		System.out.println("Secont minimum="+arr[3]);
	}

}
