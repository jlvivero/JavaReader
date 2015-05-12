public class Test
{
	public static void main(String [] args)
	{
		int x;
		x = C.in("dame un numero",0);
		System.out.println(x);
		double y;
		y = C.in("dame un doble", 0.0);
		System.out.println(y);
		String s;
		s = C.in("string now","");
		System.out.println(s);

	}
} 