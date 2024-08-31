package MyOOP;

import java.util.Scanner;

public class Test3 {
	
	private
	int empid,salary;
	String name;
	int arr[],total;
	
	public
	
	Test3(int empid, String name,int salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		
		
	}
	void set()
	{
		int i;
		Scanner sc= new Scanner(System.in);
		arr=new int[6];
		System.out.println("Enter the 6 month and days");
		for(i=0;i<6;i++)
		{
			arr[i]=sc.nextInt();
			total=total+arr[i];
			
			if(total>150)
			{
			salary=salary+2000;
			}
			else
			{
				salary=salary+100;
				
			}
		}
		
	}
	void display()
	{
		System.out.println("Emp Id: " +empid);
		System.out.println("Emp name: " +name);
		System.out.println("Emp total days: " +total);
		System.out.println("Emp salary: " +salary);
	}
	
}
