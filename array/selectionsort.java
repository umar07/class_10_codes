package array;

public class selectionsort {

	public static void main(String[] args)
	{//max=descending order
		//for ascending order change max to min and if(m[j]"<"m[min]).....
		int m[]={4,5,2,6,8,12,34,32,1,7};
		int i,j,max,t;
		for(i=0;i<10;i++)
		{
			max=i;
			for(j=i+1;j<10;j++)
			{
				if(m[j]>m[max])//change sign for change in order
					max=j;
			}
			t=m[i];
			m[i]=m[max];
			m[max]=t;
			for(int k=0;k<10;k++)
				System.out.print(m[k]+"|");
				System.out.println();
		}
		for(i=0;i<10;i++)
			System.out.print(m[i]+"|");
			
		/*String ch[]={"hell","To","Umar","hates","bakwas"};
		int min;
		for(int i=0;i<5;i++)
		{
			min=i;
			for(int j=i+1;j<5;j++)
			{
				if(ch[j].compareTo(ch[min])>0)
					min=j;
			}
			String t=ch[i];
			ch[i]=ch[min];
			ch[min]=t;
			
		}
		for(int i=0;i<5;i++)
			System.out.print(ch[i]+",");//why error  :(:(:(
	*/
	}

}
