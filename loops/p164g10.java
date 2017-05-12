package loops;

public class p164g10 {

	public static void main(String[] args) 
	{
		int n=341124,i,f=0,len,c=0,x=0;
		/*String str;
		char ch,ch1;
		str=Integer.toString(n);
		len=str.length();
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			for(j=i;j<len;j++)
			{
				ch1=str.charAt(j);
				if(ch==ch1)
					c++;
			}
			System.out.println("frequency of "+ch+" is: "+c);//how to print only once each digit??
			c=0;
		}
			*/
	int	n1=n;
		for(i=0;i<=9;i++)
		{
			while(n>0)
			{
				int d=n%10;
				if(d==i)
					f++;
				n=n/10;
			}
			n=n1;
			if(f>0)
				System.out.println("freq. of"+i+"is "+f);
			f=0;
		}
	}

}
