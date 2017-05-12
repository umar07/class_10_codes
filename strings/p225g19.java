package strings;

public class p225g19 {

	public static void main(String[] args) 
	{
		p225g19 ob=new p225g19();
		String str="HAPPY NEW YEAR ",str1="",mw="";
		int i,c1,max=0,x;
		char ch;
		int len=str.length();
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			if(ch==' ')
			{
				x=ob.countvow(str1);
				if(x>max)
				{
					max=x;
					mw=str1;
				}
				str1="";
			}
			else
				str1=str1+ch;
		}
		System.out.println(mw);
	//http://schooljava.blogspot.in/2014/12/bluej-program-on-displaying-word-with.html
		//tried to copy from here bt failed....
	}
	int countvow(String s)
	{
		int i,c=0,l=s.length();
		char ch;
		for(i=0;i<l;i++)
		{
			ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U')
				c++;
		}
		return(c);
	}

}
