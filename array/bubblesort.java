package array;

public class bubblesort {

	public static void main(String[] args) 
	{
		//for integers--
		/*int m[]={7,1,4,6,2,5,3,8,10,9};
		int i,j,t;
		for(i=0;i<9;i++)
		{
			for(j=0;j<(9-i);j++)
			{
				if(m[j]>m[j+1])//change sign for ascending/descending
				{
					t=m[j];
					m[j]=m[j+1];
					m[j+1]=t;
				}
			}
			
		}
		for(j=0;j<10;j++)
			System.out.print(m[j]+"|");
			*/
		//for characters---
	/*	char ch[]={'b','r','a','f','q'};
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<3-i;j++)
			{
				if(ch[j]>ch[j+1])
				{
					char t=ch[j];
					ch[j]=ch[j+1];
					ch[j+1]=t;
				}
					
			}
			
		}
		for(int i=0;i<5;i++)
			System.out.print(ch[i]+",");
	*/
		//for strings--
		String str[]={"Delhi","Bengaluru","Agra","Mumbai","Kolkata"};
		int i,j;
		String t;
		for(i=0;i<4;i++)
		{
			for(j=0;j<3-i;j++)
			{
				if(str[j].compareTo(str[j+1])<0)
				{
					t=str[j];
					str[j]=str[j+1];
					str[j]=t;
				}
			}
		}
		for(i=0;i<5;i++)
			System.out.print(str[i]+",");
	}

}
