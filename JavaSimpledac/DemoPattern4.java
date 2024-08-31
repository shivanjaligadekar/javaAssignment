package dac;

public class DemoPattern4 {
	
		public static void main(String[] args) {
			int row=5,space=0,star=5,i,j;
			for(int r=1;r<=row;r++)
			{
				for(i=1;i<=space;i++)
			   {
			      System.out.print(" ");
			   }
				for(j=1;j<=star;j++)
				{
					System.out.print(" * ");
				}
				System.out.println( );
				space++;
				star--;
			}
		}
			

	}





