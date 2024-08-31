package exception;

public class SingleException {
public static double devide(int a,int b) {
	return a/b;
}
	public static void main(String[] args) {
int a=100;
int b=0;
try {
	double result=devide(a, b);
	System.out.println("Result is "+result);
}
catch(ArithmeticException e) {
	//System.out.println("you can not devide any no by zero.......");
	//System.out.println(e.getMessage());
	//System.out.println(e);//printing object
	e.printStackTrace();//it shows error msg as well as line number and name of exception
}
finally {
	System.out.println("This is my finally block");
}
}
}