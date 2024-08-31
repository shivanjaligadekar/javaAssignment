package modul5;

public class CompaireString {

	public static void main(String[] args) {
		String str1="raj";
		String str2="mina";
		//1st method
		if(str1 == str2)
			System.out.println("same");
		else
			System.out.println("not same");
		
		String st=new String("reva");
		String st2=new String("reva");
		
		//2nd method
		if(st.equals(st2))
			System.out.println("same");
		else
			System.out.println("not same");
		
		//3rd method
		if(st.equals("mehir"))
			System.out.println("same");
		else
			System.out.println("not same");
		

	}

}
