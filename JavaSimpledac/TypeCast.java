class TypeCast{
	public static void main(String[] args){
	//widening
	short a = 2;
	int b = a;
	System.out.println(b);
	//Narrowing
	long c = 123456;
	int d = (int)c;
	System.out.println(d);

	int p = 56;
	short q = (short)p;
	System.out.println(q);

	int r = 7;
	char s = (char)r;
	System.out.println(s);
	
 }
}