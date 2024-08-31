package Dacjava;

public class DemoMtest {
	
		private
		    int a;
		   int b;
		   int c;
		public
		 void set() {
			System.out.println("A="+a);
			System.out.println("B="+b);
			System.out.println("c="+c);
		}
		void get(int a,int b) {
			this.a=a;
			this.b=b;
			c=a+b;
		}
		int comp() {
			return(c);

	}


}
