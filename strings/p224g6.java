package strings;

public class p224g6 {

	public static void main(String[] args) 
	{
		String str="LAL KRISH ADVANI",str1=" "+str;
			int len=str1.length();
			char ch;
		for(int i=0;i<len;i++)
		{
			ch=str1.charAt(i);
			if(ch==' ')
				System.out.print(str1.charAt(i+1)+" ");
		}//hahaha....

	}

}
