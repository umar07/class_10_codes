package strings;

public class p225g23 {

	public static void main(String[] args) 
	{
		String str="application",str1="";
		char ch,ch1,ch2=' ';
		int i,j,len;
		len=str.length();
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			for(j=i+1;j<len;j++)
			{
				ch1=str.charAt(j);
				if(ch==ch1)
					continue;
				else
					str1=str1+ch1;
			}			
		}
		System.out.println(str1);//incomplete,,,,,,,,,
	}

}
