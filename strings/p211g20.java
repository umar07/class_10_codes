package strings;

public class p211g20 {

	public static void main(String[] args)
	{

		String str=" under estimate yourself",str1="";//added space in beginning
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				ch=Character.toUpperCase(str.charAt(i+1));
				i++;
				str1=str1+" ";//added space cuz in ch=='',the space gets ignored
			}					//as i++;
			str1=str1+ch;
		}
		System.out.println(str1);

	}

}
