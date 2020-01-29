import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AgeTest {
   Age age;
   @Before
   public void inti()
   {
	 age = new Age();  
   }
	@Test
	public void test() {
		//Age age=new Age();
		assertEquals("eligible to vote",age.election(23));
	}
	@Test
	public void test1() {
		//Age age=new Age();
		assertEquals("not eligible to vote",age.election(7));
	}


}
