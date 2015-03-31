import java.util.Arrays;

public class MeanVarianceDeviation 
{
	public static void main(String[] args) 
	{
		int [] a = new int[1000];
		fillArray(a);
		Arrays.sort(a); // This is a quicksort
		// Nice way to print out an array without a loop
		System.out.println("Mean = " + mean(a) + "\n" + "Variance = " + variance(a) + "\n" + "Standard Deviation = "
	    		+ standard_deviation(a));
	}
	
	// Use the below to help build the array of randoms
	
	public static void fillArray(int [] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			double randomNumber = Math.random() * .41 + .60;
			a[i] = (int)(100 * randomNumber); // In the range [60<=x<=100]
		}
	}
	
	 public static double squared(double x) 
	 {
		    return x * x;
	 }
	
	public static double mean(int [] a)
	{
		double total = 0.0;
		for (int i = 0; i < a.length; i++)
			total += a[i];
		return total/a.length;
	}
	
	public static double variance(int [] a)
	{
		double mu = mean(a);
		double sum_squared = 0.0;
		for(int i = 0; i < a.length; i++)
			sum_squared += squared(mu - a[i]);
		return sum_squared / (a.length);
	}
	
	public static double standard_deviation(int [] a)
	{
		return Math.sqrt(variance(a));
	}
}
