package MyOOP;

public class Test_Main {
	public static void main(String[] args) {
		
		Point a1=new Point();
		Point b1=new Point();
		a1.get(20, 50);
		b1.get(60, 75);
		
		if(a1.comp()>b1.comp())
		{
			System.out.println(a1.comp());
			a1.set();
		}
		else
		{
			System.out.println(b1.comp());
			b1.set();
			
		}
	
	}

}
