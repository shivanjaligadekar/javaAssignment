package exception;

public class MultipleException {
	public static double devide(int a,int b) {
		return a/b;
	}
	public static void main(String[] args) {
	String str1="100";
	String str2="abc";
	try {
	int a=Integer.parseInt(str1);
	int b=Integer.parseInt(str2);
	double result=devide(a, b);
	System.out.println("Result is "+result);
	}
	catch(NumberFormatException e) {
		System.out.println("The String can not be stored in str2");
		System.out.println(e.getMessage());
	}
	catch(ArithmeticException e) {
		System.out.println("you can not devide any no by zero.......");
		System.out.println(e.getMessage());
		//System.out.println(e);//printing object
		//e.printStackTrace();//it shows error msg as well as line number and type of exception
	}
	catch(Exception e) {//generalized exception...if there is no maching try then this block will execute
		System.out.println("Error: there is an error");
		System.out.println(e.getMessage());
	}
	}

}
