package hdfc;
import java.util.Scanner;
public class TestAccount1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double amt;
	double amt1;
	boolean result;
	boolean result1;
	
	Account account=new Account(1,"fdfdf",10000);
	System.out.println(account);
	
	Account account1=new Account(2,"riddhi",40000);
	System.out.println(account1);
	//calling witdraw method
	System.out.println("Enter to amount witdraw");
	amt=sc.nextDouble();
	
	System.out.println("calling the witdraw method");
	result=account.witdraw(amt);
	if(result == true)
		System.out.println("Witdraw is successful");
	else
		System.out.println("there is an error");
	System.out.println("new bal is:"+account.getBal());
	
	//calling deposite method
	System.out.println("=====================================================");
	
	System.out.println("Enter amount to deposite");
	amt=sc.nextDouble();
	
	System.out.println("calling the deposite method");
	result=account.deposite(amt);
	if(result == true)
	System.out.println("deposite is successful");
	
	System.out.println("new bal is:"+account.getBal());
	
System.out.println("=====================================================");
	
	System.out.println("Enter amount to transfer");
	amt=sc.nextDouble();
	
	System.out.println("calling the deposite method");
	
	result=account.transfer(account, account1, amt);
	if(result == true)
		System.out.println("transfer is successful");
	else
		System.out.println("there is an error");
	System.out.println("new bal is:"+account.getBal());
	System.out.println("new bal is:"+account1.getBal());
	
	
	}
}
