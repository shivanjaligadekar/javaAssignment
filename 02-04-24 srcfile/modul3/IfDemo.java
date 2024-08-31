package modul3;

public class IfDemo {

	public static void main(String[] args) {
		int a=100;
		int b=600;
		int c=500;
		
		if(a==b)
			System.out.println("both are equal");
		else
			System.out.println("both are not equal");
		
		if(a>b && a>c)
			System.out.println("a is gretest");
		else if(b>a && b>c)
			System.out.println("b is gretest");
		else if(c>a && c>a)
			System.out.println("c is gretest");
		
		if(a>b ||c>a)
			System.out.println("any one condition is true");
		
		if(a!=b)
			System.out.println("both are diff");
		

	}

}
