package strings;

public class p225g17 {

	public static void main(String[] args) 
	{
		String str=" Computer Is Fun",str1="";//add space in str in beginning.
		int i,len;
		char ch;
		len=str.length();	
		for(i=len-1;i>=0;i--)
		{
			ch=str.charAt(i);
			if(ch==' ')
			{
				System.out.print(str1+" ");
				str1="";
			}
			else
				str1=ch+str1;//creates the diff. between Fun & nuF..
		}//yes yes yes!!!!!!!!!
	}

}
