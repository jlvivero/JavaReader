import java.util.*;
import javax.swing.*;

public class Cin
{
	//this methods will read basically every type of format, you can add new formats, and eventually I will generalize everything
	public static int readint(String message)
	{
		int number;
		boolean flag = true;
		do
		{
			try
			{
				number = Integer.parseInt(JOptionPane.showInputDialog(message));
				flag = false;
				return number;		
			}
			catch(NumberFormatException e)
			{
				System.out.println("This is not an integer");
			}
		}while(flag);
		return 0;
	}


	public static double readdouble(String message)
	{
		double number;
		boolean flag = true;
		do
		{
			try
			{
				number = Double.parseDouble(JOptionPane.showInputDialog(message));
				flag = false;
				return number;				
			}
			catch(InputMismatchException e)
			{
				System.out.println("This is not a number");
			}
			catch(NumberFormatException e)
			{
				System.out.println("This is not a number");
			}
		}while(flag);
		return 0.0;
	}

	public static String readS(String message)
	{
		String name;
		name = JOptionPane.showInputDialog(message);
		return name;
	}


}
