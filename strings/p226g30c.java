package strings;

public class p226g30c {

	public static void main(String[] args) 
	{
		String str="ABCDE";
		int i,j,x=-1;
		int len=str.length();
		for(i=len-1;i>=0;i--)
		{
			//x++;
			for(j=0;j<=i;j++)
				System.out.print(str.charAt(j)+" ");
			//if(i<4)
			for(int k=0;k<len-j;k++)
				System.out.print(str.charAt(k)+" ");

			System.out.println();
		}
			//yo yo yoyo
	}

}
