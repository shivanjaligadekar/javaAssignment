package MyOOP;

public class sample {
	
	private
	int a,b;
	float c;
	String s;
	boolean f;
	
	public
	sample()
	{
		a=100;
		s="PGDAC";
	}
	 sample(int a,int b)
	 {
		this.a=a;
		this.b=b;
		
	 }
	sample(String s,boolean f)
	{
		this.s=s;
		this.f=f;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(s);
		System.out.println(f);
	}

}
