package recursion.ctec.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import recursion.ctec.model.RecursionTool;

/**
 * @author Cody Henrichsen
 * @version 0.x Feb 17, 2016
 */
public class RecursionToolTest
{
	private RecursionTool testTool;
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception
	{
		testTool = new RecursionTool();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception
	{
		testTool = null;
	}

	/**
	 * Test method for {@link ctec.model.RecursionTool#getFibNumber(double)}.
	 */
	@Test
	public void testGetFibNumber()
	{
		assertTrue(1 == testTool.getFibNumber(0));
		assertFalse(0 == testTool.getFibNumber(3));
		assertTrue(Integer.MIN_VALUE == testTool.getFibNumber(-5));
	}

	/**
	 * Test method for {@link ctec.model.RecursionTool#getFactorialNumber(double)}.
	 */
	@Test
	public void testGetFactorialNumber()
	{
		assertTrue(1 == testTool.getFactorialNumber(0));
		assertTrue(120 == testTool.getFactorialNumber(5));
		assertFalse(5 == testTool.getFactorialNumber(3));
		assertTrue(Integer.MIN_VALUE == testTool.getFactorialNumber(-5));
	}

}
