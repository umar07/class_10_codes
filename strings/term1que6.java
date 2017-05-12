	package strings;

public class term1que6 {

	public static void main(String[] args) 
	{
		String str="LIVING IN DELHI",str1="";
		int i,len=str.length();
		char ch,ch1;
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				if(ch=='Z')
					ch1='A';
				else
					ch1=(char)(ch+1);
				str1=str1+ch1;
			}
			else
				str1=str1+ch;
		}
		System.out.println(str1);
		

	}

}
