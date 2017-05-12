package loops;

public class p165g17i 
{

	public static void main(String [] args)
	{
		double i,j,a=3.0,s=0.0;int n=3;
		for(i=1.0,j=1.0;i<=2*n;i+=2)
		{
			
			s=s+(i/j);
			j=j+a;
			a=a+2;
		}
		System.out.println(s);
	}//took 30 min..   could not update j like +3 +5 +7...later got right...
	//then also had to try i<=2*n;  cuz i is updating twice i+=2;
	//so when n=3...2n=6....i=1,i=3,i=5.....hence three times..
}
