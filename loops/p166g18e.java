package loops;

public class p166g18e {

	public static void main(String[] args) 
	{
		int i,j;double s=0,f=1.0,a=2.0;
		for(i=2;i<=4;i++)
		{
			for(j=i;j>=1;j--)
			{
				f=f*j;
			}
			if(i%2==0)
				s=s+(a/f);
			else
				s=s-(a/f);
			f=1.0;
		}
		System.out.println(s);
		

	}//complete......

}