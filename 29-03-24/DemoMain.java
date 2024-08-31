package Dacjava;

public class DemoMain {

	public static void main(String[] args) {
		
		DemoMtest obj=new DemoMtest();
		DemoMtest t=new DemoMtest();		
		obj.get(23, 50);
		t.get(50,60);
		
		if(obj.comp()>t.comp())
		{
			System.out.println("Obj is greater");
			 obj.set();
		}
		else
		{
			System.out.println("t is greater");
		    t.set();
		}
				

			}

		}



