package strings;

public class p224g14 {
	public static void main(String[] args)
	{
		String str="TATA STEEL IS IN JAMSHEDPUR",str1="";
		int i,len;
		char ch;
		len=str.length();
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				str1=str1+"*";
				//System.out.print("*");
			else
			str1=str1+ch;
				//System.out.print(ch);another way
			
		}
		System.out.println(str1);
			//still did the same mistake bt this time i was spared a bit...:):)	
	}

}
