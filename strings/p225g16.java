package strings;

public class p225g16 {

	public static void main(String[] args) 
	{
		String str="MOM AND DAD MET MADAM ASA ",str1="";//ADDED space in last
		char ch;
		int len=str.length();
		p225g16 ob=new p225g16();
		for(int i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(ch==' ')
			{
				ob.pal(str1);
				str1="";
			}
			else
				str1=str1+ch;
		}
			
	}
	void pal(String s)
	{
		int i,len=s.length();
		char ch;
		String str2="";
		for(i=0;i<len;i++)
		{
			ch=s.charAt(i);
			str2=ch+str2;
		}
		if(s.equals(str2))
				System.out.println(s);
		
	}

}
