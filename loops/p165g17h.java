package loops;

public class p165g17h {

	public static void main(String[] args) 
	{
		 int n=4;double s=0.0,i;
		for(i=1.0;i<=n;i++)
		{
			s=s+(i/(i+1));
			
		}
		System.out.println(s);
	}//why i should be double???
	//when i is int then result = 0.0   0.0   0.0 !!

}
