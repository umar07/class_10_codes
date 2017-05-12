package loops;

public class h2
{
	public static void main (String [] args)
	{
		int i,j,a,b,p=4;
		for(i=1;i<=5;i++)
		{				
			for(b=0;b<=p;b++)
				System.out.print(" ");
			for(j=1;j<i;j++)
			{
				System.out.print(j);
			}
		
			for(a=j;a>=1;a--)
			{
				System.out.print(a);
			}
			System.out.println();
			p--;
		}
	}/* question was 
	     1
    	121
   	   12321
  	  1234321
		*/

}