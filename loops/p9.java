package loops;

public class p9 {

	public static void main(String[] args) 
	{

		/*for (int i=1;i<=5;i++)
		{
			int k=1;
			for (int j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				if(k==1)
					k=0;
				else
					k=1;
			}
			System.out.println();
		}*/
		//two different methods to do it!!!
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				if(j%2==0)
					System.out.print("0 ");
				else
					System.out.print("1 ");
			}
			System.out.println();
		}

	}

}   /*  1
		1 0
		1 0 1
		1 0 1 0
		1 0 1 0 1
*/		 
		
