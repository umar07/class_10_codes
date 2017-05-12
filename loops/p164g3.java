package loops;

public class p164g3 {

	public static void main(String[] args)
	{
		int n1=8,n2=9,a,b,r;
		a=Math.max(n1, n2);
		b=Math.min(n1,n2);
		while(true)//this ensures the loop is infinite untill stoppedbyothermean
		{
			r=a%b;
			if(r==0)
				break;
			a=b;
			b=r;
			
		}//find the gcd,if !=1,then co else not co.
		if(b==1)
			System.out.println("co-prime");
		else
			System.out.println("not co-prime");
			
	}

}
