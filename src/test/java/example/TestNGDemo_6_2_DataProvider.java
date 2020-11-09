package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import util.Calculator;
import util.FakerUtils;

import java.io.IOException;

public class TestNGDemo_6_2_DataProvider {
    @DataProvider(name = "testData")
    public static Object[][] words() throws IOException {
        return FakerUtils.getTestData("/src/main/resources/data/divideParam.csv");
    }

    @Test(threadPoolSize = 1, invocationCount = 1,dataProvider = "testData")
    public void divTest(String x,String y) throws InterruptedException {
        int result = Calculator.divide(Integer.valueOf(x),Integer.valueOf(y));
        System.out.println(result);
    }

}
