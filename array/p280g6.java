package array;

public class p280g6 {

	public static void main(String[] args) 
	{
		p280g6 ob=new p280g6();
		int m[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int i;
		for(i=0;i<20;i++)
			ob.prime(m[i]);
	}
	void prime(int n)//function for prime no.
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==2)
			System.out.println(n);
	}

}
