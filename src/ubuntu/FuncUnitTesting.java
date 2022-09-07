package ubuntu;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class FuncUnitTesting {

	@Test
	public void test() {
		//fail("Not yet implemented");
		StandardDeviation obj = new StandardDeviation();
		double arr2[]= {1,2,3,4,5,7,8};
		double output = obj.calculateStd(arr2);
		System.out.println("output is" + output);
		assertEquals(1.5811388300841898,output);
	}

}
