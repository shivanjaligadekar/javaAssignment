package Dacjava;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int first=0,second=1,third;
		System.out.println(first+ "\n" +second);
		for(int i=2;i<8;i++) {
			third=first+second;
			System.out.println(+third);
			first=second;
			second=third;
			
		}
		
		

	}

}
