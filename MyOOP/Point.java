package MyOOP;

public class Point {
	private
	int a,b,c;
	public
	void get(int a,int b)
	{
		this.a=a;
		this.b=b;
		c=a+b;
		
	}
	void set()
	{
		System.out.println("A= " +a);
		System.out.println("B= " +b);
//System.out.println("C= "+c);
		
	}
	int comp()
	{
		return(c);
	}
		

}
