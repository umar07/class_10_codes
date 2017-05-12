package loops;

public class p1 
{
	public static void main (String [] args)
	{
		int i,j,a,b,p=5;
		char x='*';
		for(i=1;i<=5;i++)
		{
			{	for(b=1;b<=p;b++)
				{
					System.out.print(" ");
				}
				for(j=1;j<=i;j++)
				{
					System.out.print(x);
				}
			}
			for(a=2;a<=i;a++)
			{
				System.out.print(x);
			}
			System.out.println();
			p--;
		}
			
	}    /*question is         *
	 						  ***
                             *****
                            *******
                           *********   */


}
