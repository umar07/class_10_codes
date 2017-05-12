package array;

public class p280g3 {

	public static void main(String[] args) 
	{
		int m[]={1,2,3,4,5,6,7,8,9,0,11,22,33,44,55,66,77,88,99,100};
		//in exam take array as double....elm. from user.
		int i;
		double c;
		for(i=0;i<20;i++)
		{
			c=(double)((m[i]-32)*5)/9;
			System.out.println("fahr.="+m[i]+";cel.="+c);
		}
		

	}

}
