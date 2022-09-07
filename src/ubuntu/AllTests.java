package ubuntu;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FuncSpeedTest.class, FuncUnitTesting.class })
public class AllTests {

}
