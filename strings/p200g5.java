package strings;

public class p200g5 {

	public static void main(String[] args) 
	{
		String str="bluej";
		int len=str.length();
		for(int i=0;i<len;i++)
			System.out.println(str.substring(i,len)+str.substring(0,i));

	}

}
