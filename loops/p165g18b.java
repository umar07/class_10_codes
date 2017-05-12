package loops;

public class p165g18b {

	public static void main(String[] args) 
	{
		int i,j,n=3;double s=0,f=1.0,a=2.0;
		for(i=1;i<=n;i++)
		{
			f=0;
			for(j=i;j>=1;j--)
			{
				f=f*j;
			}
			s=s+a/f;
			
		}
		System.out.println(s);

	}//had to put a & f into double.
	//saw from the back similar one.

}
