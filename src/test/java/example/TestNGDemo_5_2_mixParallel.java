package example;

import org.testng.annotations.Test;
import util.Calculator;

import static org.testng.Assert.assertEquals;

public class TestNGDemo_5_2_mixParallel {

    @Test(threadPoolSize = 2,invocationCount = 5)
    public void addTest() throws InterruptedException {
        int result = Calculator.add(4,2);
        System.out.println("完成加法计算，结果为："+result);
        assertEquals(6,result);
    }

    @Test(threadPoolSize = 2,invocationCount = 5)
    public void subtractTest() throws InterruptedException {
        int result = Calculator.subtract(4,2);
        System.out.println("完成减法计算，结果为："+result);
        assertEquals(2,result);
    }
}
