public class Test
{
	public static void main(String [] args)
	{
		int foo;
		double bar;
		String baz;


		foo = Win.readInt ("Enter an Integer");
		System.out.println(foo);
		bar = Win.readDouble ("Enter a Double");
		System.out.println(bar);
		baz = Win.readString ("Enter a String");
		System.out.println(baz);

		foo = Shell.readInt ("Enter an Integer");
		System.out.println(foo);
		bar = Shell.readDouble ("Enter a Double");
		System.out.println(bar);
		baz = Shell.readString ("Enter a String");
		System.out.println(baz);



	}
} 