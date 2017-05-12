package strings;

public class p198g4 {

	public static void main(String[] args)
	{
		String str="BLUEJ";
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print(str.charAt(j)+" ");
			System.out.println();
		}

	}

}
