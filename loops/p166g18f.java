package loops;

public class p166g18f {

	public static void main(String[] args) 
	{
		int i,a=2,n=4,s=0;
		for(i=1;i<=n;i++)
		{
			s=s+(a+i);
		}
		System.out.print(s);
		

	}//easyyy :>
	//want to do as ---   (2+1)+(2+2)+(2+3)=2(1+2+3)
	//  as s=s+a*(something that can get 1+2+3..)

}
