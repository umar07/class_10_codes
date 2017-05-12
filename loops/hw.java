package loops;

public class hw
	{
		public static void main(String[] args)
		{
			int i,j,a,b,p=5;
			int k,l,m,n,o=2;
			for(i=1;i<=5;i++)
			{				
				for(b=0;b<=p;b++)
					System.out.print(" ");
				for(j=0;j<i;j++)
				{
					System.out.print(j);
				}
			
				for(a=j;a>=0;a--)
				{
					System.out.print(a);
				}
				System.out.println();
				p--;
			
			}
			for(k=4;k>=1;k--)
			{				
				for(n=0;n<=o;n++)
					System.out.print(" ");
				for(l=0;l<k;l++)
				{
					System.out.print(l);
				}
			
				for(m=l;m>=0;m--)
				{
					System.out.print(m);
				}
				System.out.println();
				o++;
			
			}

		}

}   /* question is 
       0
      010
     01210
    0123210
   012343210
  01234543210
   012343210
    0123210
     01210
      010
	   0
that above and below zero is not coming alone...
and how to do  it with less number of  variables by changing scope then how to 
initialize that "p"
*/