package epam5;


import static org.junit.Assert.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import epam5.Intrest_calculation;


public class IntrestTest{
	Intrest_calculation it=new Intrest_calculation();
@Test
	public void test() {	
	final Logger logger=LogManager.getLogger(IntrestTest.class);
	
	assertEquals(3000,it.simpleintrest(10000,5,6),0);
	logger.info("Simple interest is calculated");
	logger.debug(it.simpleintrest(10000,5,6));
	logger.warn("No warnings in Simple interest and calculated");
	logger.error("No errors in Simple interest and calculated");
	

	assertEquals(1276,it.compoundintrest(1000,5,5),2);
	logger.info("Compound interest is calculated");
	logger.debug(it.compoundintrest(1000,5,5));
	logger.warn("No warnings in Compound interest and calculated");
	logger.error("No errors in Compound interest and calculated");

			}


}
