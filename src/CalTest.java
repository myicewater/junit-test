import org.junit.Test;

import junit.framework.TestCase;


public class CalTest extends TestCase {


	public void testAddddd(){
		Calculator c  = new Calculator();
		
		int result  = c.add(2, 5);
		assertEquals(7, result);
	}
}
