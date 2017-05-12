package loops;

public class p165g17g {

	public static void main(String[] args) 
	{
		int i,f=1,s=0,j,n=5;
		for(i=1;i<=n;i++)
		{
			for(j=i;j>=1;j--)
				{
					f=f*j;
				}
			s=s+f;
			f=1;
		}
		System.out.println(s);

		
	}//asaan tha.

}
