package strings;

public class p224g12 {

	public static void main(String[] args) 
	{
		String str="IF IT RAINS YOU WILL NOT GO TO PLAY",str1="";
		str=" "+str.toLowerCase();
		char ch;
		int i,len;
		len=str.length();
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(ch==' ')
			{
				str1=str1+" "+Character.toUpperCase(str.charAt(i+1));
				i++;
				/*System.out.print(" ");
				ch1=Character.toUpperCase(str.charAt(i+1));
				System.out.print(ch1);
				i++;*/
			}
			else
				str1=str1+ch;
				//System.out.print(ch);another way
		
		}//took alot of time and tukkass   
		System.out.println(str1);

	}

}
