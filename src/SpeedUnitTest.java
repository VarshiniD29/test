import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SpeedUnitTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		StandardDeviation test23 = new StandardDeviation();
		double arr[]= {10,20,30,40,50};
		double startTime = System.nanoTime();
		double output = test23.calculateStd(arr);
		double stopTime = System.nanoTime();
		double total3 = startTime - stopTime;
		assertTrue(total3<2500);
	}

}
