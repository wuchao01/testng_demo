package example;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import util.Calculator;

public class TestNgDemo_1_1_base {

    @Test
    public void addTest() throws InterruptedException {
        SoftAssert assertion = new SoftAssert();
        int result01 = Calculator.add(4,2);
        System.out.println(result01);
        assertion.assertEquals(result01,5);
        int result02 = Calculator.add(4,2);
        System.out.println(result02);
        assertion.assertEquals(result02,5);
        int result03 = Calculator.add(4,2);
        System.out.println(result03);
        assertion.assertEquals(result03,6);
        assertion.assertAll();
    }
}
