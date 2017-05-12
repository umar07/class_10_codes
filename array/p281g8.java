package array;

public class p281g8 {

	public static void main(String[] args) 
	{
		String str[]={"aa","bb","cc","dd","ee","ff","gg","hh","ii","jj"};//for10
		String src="ff";//to be searched
		int i,x=0;
		for(i=0;i<10;i++)
		{
			if(str[i].equals(src))
			{
				x=1;
				break;
			}
		}
		if(x==1)
			System.out.println("Successful at index-"+i);
		else
			System.out.println("not succcessful");
	}
	
}
