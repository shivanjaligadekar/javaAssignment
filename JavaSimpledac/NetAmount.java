package dac;

import java.util.Scanner;

public class NetAmount {

	public static void main(String[] args) {
		String name;
		double rate,amt,dis,net_amt;
		int qty;
		System.out.println("Enter the details.....");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product name rate and quantity");
		name=sc.next();
		rate=sc.nextDouble();
        qty=sc.nextInt();
        amt=rate*qty;
        if(amt>5000)
        {
        	dis=amt*0.1;
        }
        else
        {
        	dis=amt*0.07;
        }
        net_amt=amt+dis;
        System.out.println("Product Details.....");
        System.out.println("name="+name);
        System.out.println("Rate="+rate);
        System.out.println("Quantity="+qty);
        System.out.println("Amount="+amt);
        System.out.println("Net amount="+net_amt);
	}

}
