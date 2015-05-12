import java.util.*;
import javax.swing.*;

public class C
{
	
	public static int in(String message, int x)
	{
		int number;
		boolean flag = true;
		do
		{
			String input = JOptionPane.showInputDialog(message);
			try
			{
				number = Integer.parseInt(input);
				return number;
			}
			catch(NumberFormatException e)
			{
				System.out.println("This is not an integer");
			}
		}while(flag);
		return 0;	
	}

	public static double in(String message, double x)
	{
		double number;
		boolean flag = true;
		do
		{
			String input = JOptionPane.showInputDialog(message);
			try
			{
				number = Double.parseDouble(input);
				return number;
			}
			catch(NumberFormatException e)
			{
				System.out.println("this is not a Double");
			}
		}while(flag);
		return 0.0;
	}

	public static String in(String message, String x)
	{
		String input;
		input = JOptionPane.showInputDialog(message);
		return input;
	}
}
