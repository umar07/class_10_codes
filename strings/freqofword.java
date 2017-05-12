package strings;

public class freqofword 
{

	public static void main(String[] args) 
	{
		String str="he thought that he thought ",str1="";
		String st[]=new String[20];
		int i,len=str.length(),c=0;
		char ch;
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(ch==' ')
			{
				st[c]=str1;
				str1="";
				c++;
			}
			else
				str1=str1+ch;
		}
		/*for(i=0;i<c;i++)
			System.out.println(st[i]);
	*/
		int j,c1=1;
		for(i=0;i<c;i++)
		{
			for(j=i+1;j<c;j++)
			{
				if(st[i].equals(st[j]))
				{
					c1++;
				}
			}
			System.out.println("freq. of -"+st[i]+"- is ="+c1);
			c1=1;
		}
	}

}
