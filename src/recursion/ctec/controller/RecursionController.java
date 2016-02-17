package recursion.ctec.controller;

import recursion.ctec.model.RecursionTool;
import recursion.ctec.view.RecursionFrame;

public class RecursionController
{
	private RecursionTool tool;
	private RecursionFrame baseFrame;
	private String calculatedValue;
	
	public RecursionController()
	{
		baseFrame = new RecursionFrame(this);
		tool = new RecursionTool();
	}
	
	public void start()
	{
		calculatedValue = Integer.toString(tool.getFibNumber(0));
	}
	
	public String getCalculatedValue()
	{
		return calculatedValue;
	}

	public String doFibonacci(String inputValue)
	{
		calculatedValue = "The Fibonacci sequence number of " + inputValue +
				" is " + Integer.toString(tool.getFibNumber(Integer.parseInt(inputValue)));
		return calculatedValue;
	}

	public String doFactorial(String inputValue)
	{
		calculatedValue = "The Factorial of " + inputValue + " is " +
				Double.toString(tool.getFactorialNumber(Integer.parseInt(inputValue)));
		return calculatedValue;
	}
	
}
