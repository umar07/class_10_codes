package strings;

public class p224g7 {

	public static void main(String[] args) 
	{
		String str="MOHANDAS KARAMCHAND GANDHI",str1;
		int len=str.length(),ls;
			ls=str.lastIndexOf(' ');
			str1=str.substring(ls,len)+" "+str.substring(0,ls);
			System.out.println(str1);
	}//thu thuu thuuuuu....

}
