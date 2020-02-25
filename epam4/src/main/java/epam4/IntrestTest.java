package epam4;

import static org.junit.Assert.*;

import org.junit.Test;

import epam4.Intrest_calculation;


public class IntrestTest{
	Intrest_calculation it=new Intrest_calculation();
@Test
	public void test() {	
	assertEquals(3000,it.simpleintrest(10000,5,6),0);
}
@Test
	public void test1()
	{
	assertEquals(1276,it.compoundintrest(1000,5,5),2);
			}


}
