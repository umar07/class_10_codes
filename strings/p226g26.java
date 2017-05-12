package strings;
public class p226g26 {

	public static void main(String[] args) 
	{
		String str="ICSE",str1="";
		int len=str.length(),i;
		char ch;
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			str1=ch+str1;
		}
		String st=str+str1;
		System.out.println(st);
		
	}

}
