package loops;

public class p166g18h {

	public static void main(String[] args) 
	{
		int i;double a=2.0,s=0,j=2.0;
		for(i=1;i>=1;i++)//if want to do logical way as if we really dont know 
						//the no. of loops.
		{
			s=s+(a/j);
			j+=3;
			if(j>20)
				break;
		}
		System.out.println(s);

	}//can also be done by putting i<=7(self counting the no. of loops)
	//and removing the if.

}
