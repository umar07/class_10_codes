package strings;

public class p224g10 {

	public static void main(String[] args) 
	{

		String str="tata football academy must die ";//enter space in last/shuru.
		//net way-------------------
		/*int len=str.length(),mlen=0,p=0;
		int c=0;
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
			{
				c++;
			}
			else
			{
				if(c>mlen)
				{
					mlen=c;
					p=i;
				}
				c=0;
			}
		}
		str=str.substring(p-mlen,p);
		System.out.println(str+" "+mlen);
		*/
		//my way-----------------
		//for longest and shortest word with length...
		String str1="",mword="",sword="";
		int len,i,mlen=0,slen;
		slen=str.substring(0,(str.indexOf(' '))).length();//len of 1 word to compare
		len=str.length();
		for(i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				int len1=str1.length();
				if(len1>mlen)
				{
					mlen=len1;
					mword=str1;
				}
				 if(len1<=slen)
				{
					slen=len1;
					sword=str1;
				}
				len1=0;
				str1="";
			}
			else
				str1=str1+ch;
		}
		System.out.println(mword+" "+mlen);
		System.out.println(sword+" "+slen);
	}

}
