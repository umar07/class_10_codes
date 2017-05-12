package loops;

public class p165g17j {

	public static void main(String[] args) 
	{
		int i,n=4;double j=2.0,s=0.0;
		for(i=1;i<=n;i++)
		{
			j=2.0;
			if(j%4==0)
				s=s-(j/(j+1));
			else
				s=s+(j/(j+1));
			j+=2;
			System.out.println(s);
		}
		

	}//dont know where the problem is the???so simple bt fir bhi..

}
