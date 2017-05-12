package strings;

public class p225g15 {

	public static void main(String[] args)
	{
		String str="Vital Info Resource Under Seize",str1=" "+str;
		int i,len;
		char ch;
		len=str1.length();
		for(i=0;i<len;i++)
		{
			ch=str1.charAt(i);
			if(ch==' ')
				System.out.print(str1.charAt((char)(i+1)));
		}
		
	}

}
