import java.text.*;
import java.util.*;
public class PiApproximations 
{
	public static void main(String[] args) 
	{
		double sum = 0;
		int i;
		double sign = 1.0;
		for (i = 1; i <= 5000; i = i + 2)
		{
			// running sum
			sum = sum + (sign * (1.0/i));
			sign = -1 * sign;
		}		
		double answer = 4 * sum;
		System.out.println("The approximation of pi is "+answer+ ".");
	}
}
