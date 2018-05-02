
public class Binary
{
	String decToBin(int dec)
	{
		String bin="";
		while(dec!=0)
		{
			int r=dec%2;
			bin=r+bin;
			dec=dec/2;
		}
		return bin;
	}
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
	String decToHex(int dec)
	{
	String hex="";
	while(dec!=0)
	{
		int r=dec%16;
		if(r<10)
		hex=r+hex;
		else
		{
			hex=(char)(r+55)+hex;
		}
		dec=dec/16;
	}
	return hex;
}
public static void main(String arg[])	
{	
 Binary b=new Binary();
 System.out.println(b.decToBin(20));
 System.out.println(b.decToOct(25));
 System.out.println(b.decToHex(57));
}
}