package loops;

public class p10 {

	public static void main(String[] args) 
	{
		//my best method
		//int i,j,a,b=0;
//		for(i=1;i<=5;i++)
//		{
//			for(a=0;a<b;a++)
//				System.out.print(i+" ");
//			for(j=i;j<=5;j++)
//				{
//	
//					System.out.print(j+" ");
//				}
//			System.out.println();
//			b++;
//		}
		// another tuch method
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(j<=i)
					System.out.print(i+" ");
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
