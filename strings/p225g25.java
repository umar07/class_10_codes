package strings;

public class p225g25 {

	public static void main(String[] args)
	{
		String str="MASTERING INFORMATION TECHNOLOGY ",str1="";
		int i,j,len,len1,c=0;
		char ch,ch1;
		len=str.length();
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(ch==' ')
			{
				c=0;
				len1=str1.length();
				for(j=0;j<len1;j++)
				{
					ch1=str1.charAt(j);
					if(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'||ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u')
						c++;
				}
				System.out.println("vowel in "+str1+" is "+c);
				str1="";
			}
			else
				str1=str1+ch;
		}

	}

}
