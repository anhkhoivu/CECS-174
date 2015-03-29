import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.text.*;
public class EnterPrice extends Applet implements ActionListener
{
	private Button jamie = new Button("Jamie");
	private Button joey = new Button("Joey");
	private Button jered = new Button("Jered");
	private Button jody = new Button("Jody");
	private Button total = new Button("Total");
	private TextField text = new TextField(5);
	public Label answer = new Label("Enter prices -- the average goes here");
	public Label secondLine = new Label(" ");
	private double sum = 0;
	private double jamie_sum = 0;
	private double jered_sum = 0;
	private double jody_sum = 0;
	private double joey_sum = 0;
	private double total_sum = 0;
	private int count = 0;
	private DecimalFormat df;
	public void init()
	{
		add(jamie);
		add(joey);
		add(jered);
		add(jody);
		add(total);
		add(text);
		add(answer);
		add(secondLine);
		text.addActionListener(this);
		jamie.addActionListener(this);
		joey.addActionListener(this);
		jered.addActionListener(this);
		jody.addActionListener(this);
		total.addActionListener(this);
		df = new DecimalFormat("0.00");
	}
	
	public void actionPerformed(ActionEvent event)
	{
		Object source = event.getSource();
		if(source == text || source == jamie)
		{
			jamie_sum += new Double(text.getText()).doubleValue();
			sum += new Double(text.getText()).doubleValue();
			text.setText("");
		}
		
		else if(source == text || source == jody)
		{
			jody_sum += new Double(text.getText()).doubleValue();
			sum += new Double(text.getText()).doubleValue();
			text.setText("");
		}
		
		
		else if(source == text || source == jered)
		{
			jered_sum += new Double(text.getText()).doubleValue();
			sum += new Double(text.getText()).doubleValue();
			text.setText("");
		}
		
		else if(source == text || source == joey)
		{
			joey_sum += new Double(text.getText()).doubleValue();
			sum += new Double(text.getText()).doubleValue();
			text.setText("");
		}
		
		else if (source == total)
		{
			answer.setText("Total = "+df.format(sum)+ "       " + "Jamie = "+df.format(jamie_sum)+ "      " +
					"Joey = "+df.format(joey_sum)); 
			secondLine.setText("Jered = "+df.format(jered_sum)+ "      " +
					"Jody = "+df.format(jody_sum));
		}
	}
}
