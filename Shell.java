import java.util.Scanner;
import java.util.InputMismatchException;

public class Shell
{
	private static Scanner sc = new Scanner (System.in);

	public static int readInt (String message)
	{
		int input;
		do
		{
			try
			{
				System.out.print (message + ": ");
				input = Integer.parseInt(sc.nextLine().trim());
				return input;		
			}
			catch(InputMismatchException | NumberFormatException e)
			{
				System.out.println("Error: Argument does not match method return type (int).");
			}
		} while (true);
	}


	public static double readDouble (String message)
	{
		double input;
		do
		{
			try
			{
				System.out.print (message + ": ");
				input = Double.parseDouble(sc.nextLine().trim());
				return input;				
			}
			catch(InputMismatchException | NumberFormatException e)
			{
				System.out.println("Error: Argument does not match method return type (double).");
			}
		} while (true);
	}

	public static String readString (String message)
	{
		String input;
		do
		{
			System.out.print (message + ": ");
			input = sc.nextLine();

		} while (input.trim().equals(""));
		return input;
	}
}
