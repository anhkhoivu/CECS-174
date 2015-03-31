import java.util.Arrays; // for Sorting
public class SortingExample 
{
	public static void main(String[] args) 
	{
		int [] a = new int[1000];
		fillArray(a);
		Arrays.sort(a); // This is a quicksort
		// Nice way to print out an array without a loop
		System.out.println(Arrays.toString(a));
	}
	
	// Use the below to help build the array of randoms
	
	public static void fillArray(int [] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			double randomNumber = Math.random() * .40 + .60;
			a[i] = (int)(100 * randomNumber); // In the range [60<=x<=100]
		}
	}
	
	public static void displayArray(int [] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println();
	}
}
