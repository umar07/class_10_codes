package loops;

public class p8 {

	public static void main(String[] args) 
	{
		int j,i,x=15;
		for(i=1;i<=5;i++)
		{
			for(j=i;j<=5;j++)
				{
					System.out.print(x+" ");
					x--;
				}
			System.out.println();
		}

	}
		/* 15 14 13 12 11 
 		   10 9 8 7 
		   6 5 4 
   		   3 2 
		   1    */

}
