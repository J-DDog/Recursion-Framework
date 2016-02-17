package recursion.ctec.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import recursion.ctec.controller.RecursionController;

public class RecursionPanel extends JPanel
{
	private RecursionController baseController;
	private SpringLayout baseLayout;
	private JButton fibonacciButton;
	private JButton factorialButton;
	private JTextField inputField;
	private JTextArea resultsArea;
	
	public RecursionPanel(RecursionController baseController)
	{
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		fibonacciButton = new JButton("Get the Fibonacci sequence for this number");
		factorialButton = new JButton("Get n!");
		inputField = new JTextField(20);
		resultsArea = new JTextArea(10, 20);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(fibonacciButton);
		this.add(factorialButton);
		this.add(inputField);
		this.add(resultsArea);
		resultsArea.setWrapStyleWord(true);
		resultsArea.setLineWrap(true);
		resultsArea.setEditable(false);
		resultsArea.setText(baseController.getCalculatedValue());
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, fibonacciButton, 65, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, fibonacciButton, 66, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, inputField, -6, SpringLayout.NORTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.EAST, inputField, -97, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.EAST, factorialButton, -183, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, factorialButton, 10, SpringLayout.SOUTH, resultsArea);
		baseLayout.putConstraint(SpringLayout.NORTH, resultsArea, 6, SpringLayout.SOUTH, fibonacciButton);
		baseLayout.putConstraint(SpringLayout.WEST, resultsArea, 50, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, resultsArea, -50, SpringLayout.EAST, this);
		
		
	}

	private void setupListeners()
	{
		fibonacciButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userInput = inputField.getText();
				if(checkInput(userInput))
				{
					resultsArea.append(baseController.doFibonacci(userInput));
				}	
			}
		});
		
		factorialButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userInput = inputField.getText();
				if(checkInput(userInput))
				{
					resultsArea.append(baseController.doFactorial(userInput));
				}
			}
		});
		
	}
	
	private boolean checkInput(String input)
	{
		boolean isNumber = false;
		
		try
		{
			Integer.parseInt(input);
			isNumber = true;
		}
		catch(Exception numberException)
		{
			resultsArea.setText("type in a number!!!!!");
		}
		
		return isNumber;
	}
}
