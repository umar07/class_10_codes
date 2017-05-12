package strings;

public class p223g4 {

	public static void main(String[] args) 
	{
		String str="COMPUTER APPLICATIONS",str1="";
		char ch;
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			continue;
			else
				str1=str1+ch;
			//System.out.print(ch);either directly print ch or store then print.
		}
		System.out.println(str1);

	}//acha hai string.. :):)

}