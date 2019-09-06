// Example of testing suite
// Simple example using Junit testing
// fgcurti
// 09/05/2019

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestSquare.class, TestTriangle.class })
public class AllTests {

}
