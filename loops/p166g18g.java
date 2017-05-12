package loops;

public class p166g18g {

	public static void main(String[] args) 
	{
		int i,n=3;double a=2.0,k=3.0,s=0;
		for(i=1;i<=n;i++)
		{
			s=s+((a+i)/k);
			k+=2;
		}
		System.out.println(s);
	}

}
