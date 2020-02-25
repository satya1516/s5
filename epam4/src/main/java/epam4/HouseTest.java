package epam4;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseTest {

	Complete_House ch=new Complete_House();
	
	@Test
	public void test() {
		assertEquals(2400,ch.construction("Standard",2),5);
		assertEquals(3000,ch.construction("AboveStandards",2),5);
		assertEquals(540000,ch.construction("HighStandards",300),5);
		assertEquals(2500,ch.construction("ExcellentStandards",1),5);
	}

}
