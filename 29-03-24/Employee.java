package Dacjava;
import java.util.Scanner;
public class Employee {
	private
	 int empid,att[],total,i;
	 String name;
	 double salary;
	public
	Employee(int empid,String name,double salary){
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}
	void set_a()
	{
		Scanner sc=new Scanner(System.in);
		att = new int[6];
		System.out.println("Enter 6 months presenty");
		for(i=0;i<6;i++)
		{
		   att[i]=sc.nextInt();
		   total=total+att[i];
		}
		if(total>150)
			//System.out.println();
		salary=salary+2500;
		else 
			salary=salary+1000;


	}
	
	void show() {
		System.out.println("Employee id="+empid);
		System.out.println("Employee name="+name);
		System.out.println("Employee salary="+salary);
		System.out.println("Total="+total);
	}

}
