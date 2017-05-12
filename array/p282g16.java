package array;

public class p282g16 {

	public static void main(String[] args) 
	{
		int i,j;	
		String str[]={"umar","monis","abdul","hasan","ullah"};
		char ch[]=new char[5];
		char t;
		for(i=0;i<5;i++)
			ch[i]=str[i].charAt(0);
		for(i=0;i<4;i++)
		{
			for(j=0;j<4-i;j++)
			{
				if(ch[j]>ch[j+1])
				{
					t=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=t;
				}
			}
		}
		for(i=0;i<5;i++)
			System.out.print(ch[i]);
		
			
	}

}
