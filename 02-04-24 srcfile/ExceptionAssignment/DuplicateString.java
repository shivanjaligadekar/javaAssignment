package exceptionrevision;

public class DuplicateString {
	public static String removeDuplicate(String input)
	{

	
	StringBuffer sb=new StringBuffer();
	boolean character[] =new boolean[122]; //hello world
	for(int i=0;i<input.length();i++)
	{
		
		char test =input.charAt(i);
		if(!character[test])
		{
			sb.append(test);
			character[test]=true;
		}
		return sb.toString();
	}

}
	public static void main(String[] args) {
//		boolean character[] = new boolean[122];
//		StringBuffer sb=new StringBuffer();
//		sb.append('h');
//		sb.append('i');
//		sb.append('w');
//		System.out.println(sb.toString());
		
		String input = "Hello World";
		String newString=removeDuplicate(input);
		System.out.println("String after removing duplicates : "+newString);
		
	}

}
