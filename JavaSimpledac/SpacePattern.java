package dac;

public class SpacePattern {

	public static void main(String[] args) {
		int row=5,space=4,c=1,i,j;
		for(int r=1;r<=row;r++)
		{
			for(i=1;i<=space;i++)
		   {
		      System.out.print(" ");
		   }
			for(j=1;j<=c;j++)
			{
				System.out.print(" * ");
			}
			System.out.println( );
			space--;
			c++;
		}
	}
		

}


