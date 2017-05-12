package loops;

public class p165g13 {

	public static void main(String[] args) 
	{
		int i,c=0,len,n=1123456,d;String str;char ch,ch1;
		str=Integer.toString(n);
		len=str.length();
		for(i=0;i<len;i++)
		{
			ch=str.charAt(i);
			for(int j=i+1;j<len;j++)
			{
				ch1=str.charAt(j);
				if(ch==ch1)
					c++;
			}
		}
		if(c>0)
			System.out.println("not unique");
		else
			System.out.println("unique");
		 //akhir kaar baad mai mam ne thoda bataya aur maine poora karliya....   :):):)
		
	}
}


