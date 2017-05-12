package hello;
import java.text.SimpleDateFormat;
import java.util.*;


public class clockpro 
{
	
	public static void main(String [] args)
	{
		    //via calender class
			/*Calendar cal = Calendar.getInstance();
		    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
		    System.out.println( sdf.format(cal.getTime()));*///y & how .getTime?
		
		//via date class
		String n;
		Date d=new Date();
		SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss a");
		TimeZone tz=TimeZone.getTimeZone("IST");//default is gmt time.
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any 1:\nlondon\nnew york\ntokyo\nbeuno aires");
		System.out.println("greenwich\ndublin\nist\nriyadh\nkarachi\nperth");
		n=sc.nextLine();
		switch(n)
		{
		case"london":
			tz=TimeZone.getTimeZone("Europe/London");
			break;
		case"new york":
			tz=TimeZone.getTimeZone("America/New_York");
			break;                                       
		case"tokyo":
			tz=TimeZone.getTimeZone("Asia/Tokyo");
			break;
		case"beuno aires":
			tz=TimeZone.getTimeZone("America/Beuno_Aires");
			break;
		case"greenwich":
			tz=TimeZone.getTimeZone("Greenwich");
			break;
		case"dublin":
			tz=TimeZone.getTimeZone("Europe/Dublin");
			break;
		case"ist":
			tz=TimeZone.getTimeZone("IST");
			break;
		case"riyadh":
			tz=TimeZone.getTimeZone("Asia/Riyadh");
			break;
		case"karachi":
			tz=TimeZone.getTimeZone("Asia/Karachi");
			break;
		case"perth":
			tz=TimeZone.getTimeZone("Australia/Perth");
			break;
			default:
				System.out.println("theek se daal be");
				
		}
		ft.setTimeZone(tz);
		System.out.println("time-"+ft.format(d));
		    

		}			
	}


