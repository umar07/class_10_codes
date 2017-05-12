package strings;

public class p226g30e {

	public static void main(String[] args) 
	{
		String str="EDCBA";
		int i,j,p=0;
		int len=str.length();
		for(i=len-1;i>=0;i--)
		{
			for(int b=0;b<p;b++)
				System.out.print(" ");
			for(j=0;j<=i;j++)
				System.out.print(str.charAt(j));
			System.out.println();
			p++;
		}

	}

}
