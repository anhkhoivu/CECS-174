// Arrays as presented with the combination of arrays.
// Searchers an array for the first occurrence of a value input by user.
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class TryArray extends Applet implements ActionListener
{	
	private TextField text = new TextField(5);
	private Label label = new Label("Enter Score To Find:");
	private TextArea result = new TextArea(3,30);
	private final int [] score = new int[100];
	public void init()
	{
		add(label);
		add(text);
		add(result);
		int i = 0;
		for (int b = 0; b < score.length; b++)
		{
			final int randomNum = (int) (Math.random() * 1000);
			score[b] = randomNum;
			final int a = score[b];
		}
		System.out.println(score);
		text.addActionListener(this);
		result.setText("Score not found yet");
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int testValue = Integer.parseInt(text.getText());
		result.setText("Score not found");
		for (int i = 0; i < score.length; i++)
		{
			if (testValue == score[i])
			{
				result.setText("Found score " + testValue + " at index " + i);
				break;
			}
		}
	}
}
	