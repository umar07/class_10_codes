package array;

public class p281g9 {

	public static void main(String[] args) 
	{
		//for now just 5 names
		String str[]={"ef","sf","fg","fd","af"},t;
		int m[]={211,334,456,678,987},t1;
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
					
					t1=m[j];
					m[j]=m[j+1];
					m[j+1]=t1;
				}
			}
		}
		for(i=0;i<5;i++)
			{
				System.out.print(str[i]+"---"+m[i]);
				System.out.println();
			}
	}

}
