package strings;

public class p226g29 {

	public static void main(String[] args)
{
		String str="BLUEJ";
		int i,j;
		int len=str.length();
		for(i=len-1;i>=0;i--)
		{
			for(j=0;j<=i;j++)
				System.out.print(str.charAt(j));
			System.out.println();
		}

	}

}
