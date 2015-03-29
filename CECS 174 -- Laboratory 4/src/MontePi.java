// Monte Carlo Methods for Pi.
import java.text.*;
import java.util.*;
public class MontePi 
{
	public static void main(String[] args) 
	{
		int hits = 0;
		double x = 0, y = 0;
		DecimalFormat df = new DecimalFormat ("0.000");
		Scanner sc = new Scanner(System.in);
		System.out.print("How many darts?: ");
		int darts = sc.nextInt();
		for(int i = 1; i <= darts; i++)
		{
			x = Math.random();
			y = Math.random();
			if (x * x + y * y < 1.0)
				hits++;
		}
		double myPi = (4.0 * hits) / darts;
		System.out.println("My approximation of PI = "+myPi);
		if (myPi > Math.PI)
			System.out.println("Which is: "+df.format((Math.PI / myPi) * 100.0) + "% Accurate.");
		else 
			System.out.println("Which is: "+df.format((myPi / Math.PI) * 100.0) + "% Accurate.");
	}
}
