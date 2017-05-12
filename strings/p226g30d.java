package strings;

public class p226g30d {

	public static void main(String[] args) 
	{
		String str="ABCDE";
		int i,j,p=0;
		int len=str.length();
		for(i=0;i<len;i++)
		{
			for(int b=0;b<p;b++)
				System.out.print(" ");
			for(j=i;j<len;j++)
				System.out.print(str.charAt(j));//try and add space in last!!
			System.out.println();
			p++;
		}

	}

}
