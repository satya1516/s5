package epam5;
import static org.junit.Assert.*;

import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import epam5.Complete_House;

public class HouseTest {

	@Test
	public void test() {
		final Logger logger=LogManager.getLogger(IntrestTest.class);
		Complete_House ch=new Complete_House();
		assertEquals(2400,ch.construction("Standard",2),5);
			//assertEquals(240000.00,ch.construction("standard", 200),0);
			logger.info("House construction with Standard material is calculated");
			logger.debug(ch.construction("Standard",2));
			logger.warn("No warnings in calculating the standard material house construction cost");
			logger.error("No errors in calculating the standard material house construction cost");
		
			assertEquals(3000,ch.construction("AboveStandards",2),5);
			logger.info("House construction with Above Standard material is calculated");
			logger.debug(ch.construction("AboveStandards",2));
			logger.warn("No warnings in calculating the Above standard material house construction cost");
			logger.error("No errors in calculating the Above standard material house construction cost");
			//assertEquals(3000,ch.construction("AboveStandards",2),5);
			assertEquals(540000,ch.construction("HighStandards",300),5);
		logger.info("House construction with High standard material is calculated");
		logger.debug(ch.construction("HighStandards",300));
		logger.warn("No warnings in calculating the Highe standard material house construction cost");
		logger.error("No errors in calculating High standard material house construction cost");

		assertEquals(2500,ch.construction("ExcellentStandards",1),5);

		logger.info("House construction with Excellentestandard Full automatic material is calculated");
		logger.debug(ch.construction("ExcellentStandards",1));
		logger.warn("No warnings in calculating the Excellentstandard Full automatic material house construction cost");
		logger.error("No errors in calculating Excellent standard Full automatic material house construction cost");
		

	}
	}