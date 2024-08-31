package Dacjava;

public class MainDemo {

	public static void main(String[] args) {
		MyTest obj=new MyTest();
		
		obj.get(23, 50.20, "DAC");
		obj.set();
		MyTest t=new MyTest();
		t.get(50,60.54,"March-24");
		t.set();
		//System.out.println(obj.a);
		//System.out.println(obj.b);
		//System.out.println(obj.c);

	}

}
