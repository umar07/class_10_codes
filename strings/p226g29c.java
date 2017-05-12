package strings;

public class p226g29c {

	public static void main(String[] args) 
	{
		String str="BLUEJ";
		int i,j;
		int len=str.length();
		for(i=0;i<len;i++)
		{
			for(j=i;j<len;j++)
				System.out.print(str.charAt(j));
			System.out.println();
		}

	}

}
