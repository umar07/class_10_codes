package array;

public class p280g2 {

	public static void main(String[] args)
	{
		int m[]={1,3,5,7,8,9,11,14,15,16,19,23,34,54,12,34,45,65,46,43};
		//take elm. from user...
		int i;
		for(i=0;i<19;i++)//<19and not<20cuz last elm.gets checkin[18+1]ie.19elm.
		{
			if(m[i]==(m[i+1]-1))
				System.out.println(m[i]+"-"+m[i+1]);
		}
	}

}
