package MyOOP;

public class Method {
	
	private
	int a,b;
	double c;
	
	public
	
	void set()
	{
		a=34;
		b=23;
		System.out.println("Addition= " +(a+b));
		
	}
	int set(int a,int b)
	{
		this.a=a;
		this.b=b;
		return(a*b);
	}
	double set(double c)
	{
		this.c=c;
		c=c+12;
		return(c);
		
	}

}
