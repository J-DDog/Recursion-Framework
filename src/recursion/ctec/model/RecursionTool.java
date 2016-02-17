package recursion.ctec.model;

public class RecursionTool
{
	
	public int getFibNumber(int position)
	{
		//Defensive code against user evilness
		if(position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		if(position == 0 || position == 1) //Base Case
		{
			return 1;
		}
		else //Recursive Case -- Keeps calling the method
		{
			return getFibNumber(position - 1) + getFibNumber(position - 2);
		}
	}
	
	public double getFactorialNumber(double position)
	{
		if(position < 0)
		{
			return Integer.MIN_VALUE;
		}
		
		if(position == 0)
		{
			return 1;
		}
		else 
		{
			return position * getFactorialNumber(position - 1);
		}
	}
}
