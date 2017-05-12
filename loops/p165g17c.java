package loops;

public class p165g17c 
{
	public static void main (String [] args)
	{
		int i,n=5,s=0,a=2;
		for(i=1;i<=n;i++)
		{
			if(a%4==0)
				s=s-a;
			else
				s=s+a;
			a+=2;
		}
		System.out.println(s);
	}

}// s=2-4+6-8....;
