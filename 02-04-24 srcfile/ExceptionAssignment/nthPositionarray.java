package exceptionrevision;
import java.util.Scanner;
public class nthPositionarray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("Enter the elements of array");
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		try {
		System.out.println("Enter the index position from 0 to 4");
		int position=sc.nextInt();
		System.out.println(" value for index " +position + "is : "+arr[position]);
		
		}
		catch(Exception e)
		{
			System.out.println("Invalid position ");
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
