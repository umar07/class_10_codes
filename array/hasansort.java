package array;

public class hasansort {

	public static void main(String[] args) 
	{	
		//for characters---
		char ch[]={'B','L','U','E','J'},t;
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<4;j++)
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
			System.out.print(ch[i]+",");
	
		//for strings---
		/*String str[]={"patani","hadi","monis","umar","hasan"},t;
		int i,j;
		for(i=0;i<5;i++)
		{
			for(j=0;j<4;j++)
			{
				if(str[j].compareTo(str[j+1])>0)
				{
					t=str[j];
					str[j]=str[j+1];
					str[j+1]=t;
				}
			}
		}
		for(i=0;i<5;i++)
			System.out.print(str[i]+",");
	*/
		//for digits--
	/*	int m[]={10,2,4,1,3,6,7,9,5,8},t;
		int i,j;
		for(i=0;i<10;i++)
		{
			for(j=0;j<9;j++)
			{
				if(m[j]>m[j+1])
				{
					t=m[j];
					m[j]=m[j+1];
					m[j+1]=t;
				}
			}
		}
		for(i=0;i<10;i++)
			System.out.print(m[i]+"|");
			*/
	}
	

}
