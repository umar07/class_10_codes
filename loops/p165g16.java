package loops;

public class p165g16 {

	public static void main(String[] args) 
	{
		int n=5986,r,c=0;
		while(n>0)
		{
			r=n%10;
			if(r==0)
				c++;
			n=n/10;
		}
		if(c>0)
		System.out.println(" duck");
		else 
			System.out.println("no duck");

	}

}//thanks thanks....
