package strings;

public class p225g18 {

	public static void main(String[] args) 
	{
		String s="James Gosling deveeloped Java";//saw from internet...:):) 
		int max=0,i,j,c=0,len;
		char ch=' ';
		len=s.length();
	/*	for(i=0;i<len;i++) 
		{ 
			c=0; 
			for(j=i;j<len;j++) 
			{ 
				if(s.charAt(i)==s.charAt(j) )
				c++; 
			} 
			if(c>max) 
			{ 
				max=c; 
				ch=s.charAt(i); 
			} 
		} 
		System.out.println(ch);
		*/
		//my way------  ;)
		int mtimes=0;char mchar=' ';
		for(i=65;i<=90;i++)
		{
			for(j=0;j<len;j++)
			{
				ch=s.charAt(j);
				if(ch==(char)i||ch==(char)(i+32))
					c++;
			}
			if(c>mtimes)
				{
					mtimes=c;
					mchar=(char)i;
				}
			c=0;
		}
System.out.println(mchar);

	}

}
