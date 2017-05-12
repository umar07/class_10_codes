package loops;

public class p4 
{
	public static void main(String [] args)
	{
		int i,j,b,p=5;
		for(i=1;i<=5;i++)
		{
			for(b=1;b<=p;b++)
				System.out.print(".");
			for(j=1;j<=i;j++)
				System.out.print(" "+i);
			System.out.println();
			p--;
		}
		
	}

}/* question is  ..... 1
				 .... 2 2
				 ... 3 3 3
  				 .. 4 4 4 4
 				 . 5 5 5 5 5
*/