package exceptionrevision;

public class CopyArray {
	public static void copyArray(int source[],int destination[])
	{
		for(int i=0;i<source.length;i++) {
			destination[i]=source[i];
		}
	}
public static void printArray(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+ " ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int arr2[] =new int[9];
		try {
		
		
		copyArray(arr,arr2);
		System.out.println("Elements of first array are copied successfully in second array");
	}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array size exceeds");
		}
		finally {
			System.out.println("First array");
			printArray(arr);
			System.out.println("Second array");
			printArray(arr2);
		}
	}

}
