package loops;

public class p165g17b {

	public static void main(String[] args)
	{
		int i,n=5,s=0,a=1,b=1;
		for(i=1;i<=n;i++)
		{
			s=(a+b);
			a=b;
			b=s;
		}
		System.out.println(s);

	}

}//not complete.cannot find error...

