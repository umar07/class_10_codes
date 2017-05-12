package loops;

public class p168g31autom {

	public static void main(String[] args)
	{
		int n=7,copy=n,c=0,sq=n*n,end;
				while(copy>0)
				{
					c++;
					copy=copy/10;
				}
		end=sq%(int)(Math.pow(10,c));
		if(end==n)
			System.out.println("auto");
		else
			System.out.println("not auto");

	}//internet :):)

}
