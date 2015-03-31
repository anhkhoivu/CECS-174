import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class myFunctions 
{
	public myFunctions()
	{
		// default constructor
	}
	
	public int menu()
	{
		String selection = "5";
		selection = JOptionPane.showInputDialog("Select Math Function, Enter number: \n" +
					"1. Find Absolute Value \n"+
					"2. Find Factorial \n"+
					"3. Find Sine of an angle \n"+
					"4. Find Cosine of an angle \n" +
					"5. Exit \n");
		int result = Integer.parseInt(selection); // previous work for converting string
		return result;
	}
	
	public void absolute()
	{
		String input1 = JOptionPane.showInputDialog("To Find Absolute Value, Enter number: \n");
		double result = Double.parseDouble(input1);
		if (result < 0.0)
		{
			result = -1.0 * result;
		}
		JTextArea outputAbsolute = new JTextArea();
		outputAbsolute.setText("The Absolute Value of Number = " +result);
		JOptionPane.showMessageDialog(null, outputAbsolute, "Absolute Value", JOptionPane.INFORMATION_MESSAGE);
	
	}
	
	public void factorial()
	{
		String input2 = JOptionPane.showInputDialog("To Find n Factorial, n!, Enter an integer: \n");
		int result = Integer.parseInt(input2);
		int temp = 1;
		for (int i = 1; i <= result; i++)
			temp = temp * i;
		JTextArea outputFactorial = new JTextArea();
		outputFactorial.setText(result+"! is " +temp);
		JOptionPane.showMessageDialog(null, outputFactorial, "Absolute Value", JOptionPane.INFORMATION_MESSAGE);	
	}
	
	public int factorial(int n)
	{
		int temp = 1;
		for(int i = 1; i <= n; i++)
		{
			temp = temp * i;
		}
		return temp;
	}

	public void sine()
	{
		String input3 = JOptionPane.showInputDialog("Enter Angle in degrees");
		double result = Double.parseDouble(input3);
		double x = result / 57.269; // convert degrees to radians
		// Note that the Taylor Series uses the above factorial function
		double temp = 0.0;
		int sign = 1;
		for(int i = 1; i <= 7; i = i + 2)
		{
			temp = temp + sign * Math.pow(x, i) / factorial(i); // overloaded factorial
			sign = sign * (-1); // get the signs to alternate from minus to plus
		}
		JTextArea outputSine = new JTextArea();
		outputSine.setText("sine("+result+") is: " +temp);
		JOptionPane.showMessageDialog(null, outputSine, "Sine Value", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void cosine()
	{
		String input4 = JOptionPane.showInputDialog("Enter angle in degrees");
		double result = Double.parseDouble(input4);
		double y = result / 57.269;
		double temp = 0;
		int sign = 1;
		for (int i = 0; i <= 7; i = i + 2)
		{
			temp = temp + sign * Math.pow(y, i) / factorial(i);
			sign = sign * (-1); 
		}
		JTextArea outputCosine = new JTextArea();
		outputCosine.setText("Cosine("+result+") is: " +temp);
		JOptionPane.showMessageDialog(null, outputCosine, "Cosine Value", JOptionPane.INFORMATION_MESSAGE);
	}
}
