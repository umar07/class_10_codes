package strings;

public class p224g8 {

	public static void main(String[] args) 
	{
		String str="WE ARE LIVING IN COMPUTER WORLD";//user
		char ch='E';//user	
		int len=str.length(),c=0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)==ch)
				c++;
		}
		System.out.println(c);

	}//very very easy....

}
