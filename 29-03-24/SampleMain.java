package Dacjava;

public class SampleMain {

	public static void main(String[] args) {
	Sample s = new Sample();
	s.show();
	
	System.out.println();
	Sample s1 = new Sample(100,200);
	s1.show();
	
	System.out.println();
	Sample s2 = new Sample(12345,"PG-DAC",true);
	s2.show();
	
	System.out.println();
    Sample s3 = new Sample(200,300,30.40,"PG-DAC",true);
	s3.show();

	}

}
