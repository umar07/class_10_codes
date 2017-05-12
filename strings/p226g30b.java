package strings;

public class p226g30b {

	public static void main(String[] args) 
	{
		String str="ABCDEFGHIJKLMNO";
		int i,j,x=0;
		int len=str.length();
		for(i=0;i<len;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print(str.charAt(x)+" ");
				x++;
			}
			System.out.println();
		}//what man???why????

	}

}
