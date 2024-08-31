package dac;
import java.util.Scanner;
public class Paisa {

	public static void main(String[] args) {
	int rs,paisa;
	System.out.println("Enter Rupees");
	Scanner sc=new Scanner(System.in);
	rs=sc.nextInt();
	paisa=rs*100;
     System.out.println("Conversion of rupees into paisa="+paisa);
	}

}
