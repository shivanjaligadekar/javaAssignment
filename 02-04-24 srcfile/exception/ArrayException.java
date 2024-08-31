package exception;

public class ArrayException {

	public static void main(String[] args) {
		
int arr[]=new int [3];
arr[0]=10;
arr[1]=20;
arr[2]=30;
try {
System.out.println(arr[10]);
	}
catch(ArrayIndexOutOfBoundsException e) {
	System.out.println("you can not have 10nt element");
	System.out.println(e.getMessage());
}
	}
}
