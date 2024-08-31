package Dacjava;

public class Sample {
	private
	int a,b;
	double c;
	String d;
	boolean e;
	public
	 Sample() {
		a=10;
		c=10000;
	}
	Sample(int a,int b){
		this.a=a;
		this.b=b;
	}
	Sample(double c,String d,boolean e){
		this.c=c; 
		this.e=e;
		this.d=d;
		
	}
	Sample(int a, int b, double c , String d , boolean e){
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
	
		
	}
	void show()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
