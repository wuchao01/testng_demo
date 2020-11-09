package example;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgDemo {

    @BeforeMethod(alwaysRun = true)
    public void putBefore(){
        System.out.println("这是最先执行");
    }

    @Test(priority = 2)
    public void putInA(){
        System.out.println("这是A");
    }

    @Test(priority = 1)
    public void putInB(){
        System.out.println("这是B");
    }

    @Test(enabled = false)
    public void putInC(){
        System.out.println("这是C");
    }

    @Test(priority = 3)
    public void putInD(){
        System.out.println("这是D");
    }

    @AfterMethod(alwaysRun = true)
    public void putAfter(){
        System.out.println("这是最后执行");
    }
}
