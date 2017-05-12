package strings;

public class p226g30f {

	public static void main(String[] args)
	{
		String str="ABCDE";
		int i,j,p=5;
		int len=str.length();
		for(i=0;i<len;i++)
		{
			for(int b=0;b<p;b++)
				System.out.print(" ");
			for(j=0;j<=i;j++)
				System.out.print(str.charAt(j));
			System.out.println();
			p--;
		}

	}

}
