package strings;

public class p224g11 {

	public static void main(String[] args) 
	{
		String str="RAIN WATER HARVESTING ORGANISED BY JUSCO";
		int len,a=0,e=0,i=0,o=0,u=0;
		char ch;
		len=str.length();
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(ch=='A')
				a++;
			if(ch=='E')
				e++;
			if(ch=='I')
				 i++;
			if(ch=='O')
				o++;
			if(ch=='U')
				u++;
		}
		System.out.println("Frequency of A= "+a);
		System.out.println("Frequency of E= "+e);
		System.out.println("Frequency of I= "+e);
		System.out.println("Frequency of O= "+o);
		System.out.println("Frequency of U= "+u);

	}//easy mannnnnn,,,,,,,

}
