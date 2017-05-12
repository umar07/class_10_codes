package strings;

public class pg199g5 {

	public static void main(String[] args) 
	{
		String str="BLUEJ";
		int i,len,j,b,p=0;
		len=str.length();
		for(i=len-1;i>=0;i--)
		{
			for(b=1;b<=p;b++)
				System.out.print(" ");
			for(j=0;j<=i;j++)
				System.out.print(str.charAt(j));
			System.out.println();
			p++;
			
		}

	}

}
