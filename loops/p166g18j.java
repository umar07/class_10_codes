package loops;

public class p166g18j {

	public static void main(String[] args) 
	{
		int i,n=4;double s=0.0,a=2.0,j=1.0,k=1.0;
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
				s=s-(Math.pow(a,j)/k);
			else
				s=s+(Math.pow(a,j)/k);
			j=j+2;
			k=k+4;
			System.out.println(s);
		}

	}//not complete.....  how to get the -ve and +ve is issue.

}
