package strings;

public class p224g13 
{
	public static void main(String[] args)
	{
		String str="BLUEJ";
		int i,len;
		char ch;
		len=str.length();
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			int n=(int)ch;
			System.out.println("ASCII of "+ch+" is : "+(n));
		}
	}//too easy peezy.........

}
