package Dacjava;

public class MethodOver {
	private
	int a,b;
	double c;
	public
	void set()
	{
		a=10;
		b=20;
		System.out.println("Addition="+(a+b));
	}
	int set(int a,int b) {
		return(a*b);
	}
	double set(double c) {
		
		c=c+20.30;
		return c;
	}
	

}
