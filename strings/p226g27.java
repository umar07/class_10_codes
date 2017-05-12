package strings;

public class p226g27 {

	public static void main(String[] args) 
	{
		String str="COMPUTER APPLICATIONS";
		int i,len,c=0;
		char ch,ch1;
		len=str.length();
		System.out.println("character\tfrequency");
		for(ch='A';ch<='Z';ch++)
		{
			for(i=0;i<len;i++)
			{
				ch1=str.charAt(i);
				if(ch==ch1)
					c++;
			}
			if(c>0)
			System.out.println(ch+"\t\t"+c);
			c=0;
		}

	}

}
