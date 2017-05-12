package loops;

public class p6 
{
	public static void main (String [] args)
	{
		int i,j;
		for(i=1;i<=9;i+=2)
		{
			for(j=i;j>=1;j-=2)
				System.out.print(j+" ");
			System.out.println();
		}
	}
	

}     /* 1 
		 3 1 
		 5 3 1 
		 7 5 3 1 
		 9 7 5 3 1  */

