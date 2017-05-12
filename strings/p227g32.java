package strings;

public class p227g32 {

	public static void main(String[] args) 
	{
		String str="BLUEJ";
		int i,j,len,b,p=4,n=2;//n can be taken by user
		len=str.length();
		switch(n)
		{
		case 1:
			for(i=0;i<len;i++)
			{
				for(b=0;b<p;b++)
					System.out.print(" ");
				for(j=0;j<=i;j++)
					System.out.print(str.charAt(i));
				System.out.println();
				p--;
			}
			break;
		case 2://case 2 took time/....
			for(i=len-1;i>=0;i--)
			{
				for(j=0;j<=i;j++)
				{
					
					System.out.print(str.charAt(j));
				}
				System.out.println();
				
			}
			break;
		}

	}

}
