package loops;

public class p164g1a {

	public static void main(String[] args)
	{
		int i,j=1;
		for(i=1;i<=10;i++)
		{
			if(i%2==0)
				System.out.println(-j);
			else
				System.out.println(" "+j);
			j=j+2;
			
		}

	}

}
