package strings;

public class p202g8 {

	public static void main(String[] args) 
	{
		String str="WelCOme To SChOol";
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)==true)
				System.out.print(Character.toLowerCase(ch));
			else if(Character.isLowerCase(ch)==true)
				System.out.print(Character.toUpperCase(ch));
			else
				System.out.print(ch);
		}
	}

}
