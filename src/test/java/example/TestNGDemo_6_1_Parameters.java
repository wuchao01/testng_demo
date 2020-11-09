package example;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import util.Calculator;

import static org.testng.Assert.assertEquals;

public class TestNGDemo_6_1_Parameters {
    @Parameters({"x","y","result"})
    @Test(threadPoolSize = 1,invocationCount = 1)
    public void addTest(int x,int y, int result) throws InterruptedException {
        int result01 = Calculator.add(x,y);
        System.out.println(result01);
        assertEquals(result,result01);
    }
}
