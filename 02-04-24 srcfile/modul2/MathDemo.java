package modul2;

public class MathDemo {

	public static void main(String[] args) {
		int min=20;
		int max=45;
		int k=(int)((Math.random()*(max-min))+min);
		System.out.println("k is"+k);
		
		double d=Math.random();
		System.out.println(d);
		
		int i=(int)(Math.random()*100);
		System.out.println(i);
		
		System.out.println(Math.min(33,44));
		System.out.println(Math.max(44,33));
		System.out.println(Math.ceil(44.6));
		System.out.println(Math.floor(44.5));
		System.out.println(Math.sqrt(56));
	}

}
