import javax.swing.*;
import java.text.*;
public class myMath 
{
	public static void main(String[] args)
	{
		myFunctions m = new myFunctions(); // create an object m of my math library
		int choice = m.menu(); // Show the menu of available math functions
		switch(choice)
		{
			case 1:
					m.absolute();
					break;
			case 2:
					m.factorial();
					break;
			case 3:
					m.sine();
					break;
			case 4:
					m.cosine();
					break;
			case 5:
					System.exit(0);
					break;
			default:
					System.exit(0);
		}

	}

}
