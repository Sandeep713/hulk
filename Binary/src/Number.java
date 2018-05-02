
public class Number
{
	String decToOct(int dec)
	{
		String oct="";
		while(dec!=0)
		{
			int r=dec%2;
			oct=r+oct;
			dec=dec/2;
		}
		return oct;
	}
public static void main(String arg[])	
{	
 Binary b=new Binary();
 System.out.println(b.decToBin(25));
}
}