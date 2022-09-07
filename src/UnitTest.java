import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UnitTest {

	@Test
	void test() {
		StandardDeviation obj = new StandardDeviation();
		double arr2[]= {1,2,3,4,5};
		double output = obj.calculateStd(arr2);
		System.out.println("output is" + output);
		assertEquals(1.5811388300841898,output);
		
	}

}
