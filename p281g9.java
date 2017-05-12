
public class p281g9 {

	public static void main(String[] args) 
	{
		String str[]={"um ma","mo ra","ha us","ab ha","va kp","kh si","va si","aa ah"};
		int m[]={123,456,789,321,654,987,132,465};
		int i,j;
		int tem;
		String temp;
		for(i=0;i<7;i++)
		{
			for(j=i+1;j<8;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					temp=str[j];
					str[j]=str[j+1];
					str[j]=temp;
					tem=m[j];
					m[j]=m[j+1];
					m[j+1]=tem;
				}
			}
		}
		//why problem??????????? :(:(:(
		for(i=0;i<8;i++)
		{
			System.out.println(str[i]);
			System.out.println(m[i]);
		}
	}

}
