package loops;

public class p11 {

	public static void main(String[] args) 
	{
		
		int l=1;
		for(int i=1;i<=5;i+=1)
		{
			
			int k=l;
			for(int j=1;j<=5;j++)
			{
				System.out.print(k+ " ");
				k=k+2;
				if(k>9)
					k=1;
			}
			l=l+2;
			System.out.println();
		}
	
	} /* 1 3 5 7 9 
		 3 5 7 9 1 
		 5 7 9 1 3 
		 7 9 1 3 5 
		 9 1 3 5 7   */

}
