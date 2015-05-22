import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class Win
{
	public static int readInt (String message)
	{
		int input;
		do
		{
			try
			{
				input = Integer.parseInt(JOptionPane.showInputDialog(message));
				return input;		
			}
			catch (InputMismatchException | NumberFormatException e)
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
				input = Double.parseDouble(JOptionPane.showInputDialog(message));
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
			System.out.println ("Error: Parsed String is Empty!")
			input = JOptionPane.showInputDialog(message);

		} while (input.trim().equals(""));
		return input;
	}
}
