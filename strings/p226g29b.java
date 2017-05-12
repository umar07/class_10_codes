package strings;

public class p226g29b {

	public static void main(String[] args) 
	{
		String str="BLUEJ";
		int i,j;
		int len=str.length();
		for(i=len-1;i>=0;i--)
		{
			for(j=i;j<len;j++)
				System.out.print(str.charAt(i)+" ");
			System.out.println();
		}

	}

}
