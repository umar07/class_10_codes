package strings;

public class p205g12 {

	public static void main(String[] args) 
	{
		String str="New Delhi Is The Capital of India ",str1="";//added space 
		int len=str.length();//in last because word is saved before space
		for(int i=0;i<len;i++)//if no space then india is not stored.
		{
			char ch=str.charAt(i);
			if(ch==' ')
				{
					System.out.print(str1+" ");
					str1="";
				}
			else
				str1=ch+str1;//ulta save hoga
		}
	}

}
