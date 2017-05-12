package loops;

public class p2 {

	public static void main(String[] args) 
	{
		int i,j,b,p=6;
		for(i=0;i<6;i++)
		{
			for(b=1;b<=p;b++)
			{
			  System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				System.out.print(j+" " );
			}
			System.out.println();
			p--;
			
		}
	}   /*question is     0 
              			 0 1 
    					0 1 2 
     				   0 1 2 3 
  					  0 1 2 3 4 
  					 0 1 2 3 4 5  
                   OR replace j+" " with "* "  
                   */
                   

}
