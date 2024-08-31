package hdfc;

public class TestAccount {

	public static void main(String[] args) {
		Account a1=new Account();
		Account a2=new Account(1243435,"meena",100000);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println("==========================================================");
		
		//change bal
		//change name
		//display all

		System.out.println("bal"+a2.getBal());
		
		a2.setBal(400000);
		a2.setAccHolderName("reva");
		System.out.println("Account no is"+a2.getAccNo());
		System.out.println("updated bal is"+a2.getBal());
		System.out.println("updated name is"+a2.getAccHolderName());
		System.out.println("================================================================");
		
		//asign all
		a1.setAccNo(2);
		a1.setAccHolderName("shree");
		a1.setBal(4000000);
		System.out.println("================================================================");
		
		
	}

}
