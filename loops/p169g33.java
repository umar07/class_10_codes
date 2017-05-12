package loops;

public class p169g33 {

	public static void main(String[] args) 
	{
		int n=145,copy=n,r,i,f=1,s=0;
				while(copy>0)
				{
					r=copy%10;
					for(i=r;i>=1;i--)
					{
						f=f*i;
					}
					s=s+f;//after fact. of 5,f=120..next time it wil be 120*i...
					f=1;//thats y every new r should have as f=1..for corrcet fact.
					copy=copy/10;
				}
				if(s==n)
					System.out.println("special123");
				else
					System.out.println("not special");

	}

}
