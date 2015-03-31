import java.text.*;
import java.util.*;
public class Montee2 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int rows = 10000;
		double e_approx = 1.0;
		double randomNumber = 0.0;
		double randomNumber1 = 0.0;
		int counter = 0;
		for(i = 1; i <= rows; i++)
		{
			counter = counter + 2;
			randomNumber = Math.random();
			randomNumber1 = Math.random();
			while(randomNumber > randomNumber1)
			{
				counter++;
				randomNumber = randomNumber1;
				randomNumber1 = Math.random();
			}
		}
		e_approx = (float)(counter)/(float)(rows);
		System.out.println("Approximation of e by immediate predecessor is "+e_approx);
	}
}
