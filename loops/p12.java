package loops;

public class p12 {

	public static void main(String[] args) 
	{
		//n is given by myself here;
		int i,n=4,s=0;
		for(i=1;i<=n;i++)
		{
			s=s+(i+(i*10+9));
		}
		System.out.println(s);
	}


}// s=1+19+2+29+3+39;
