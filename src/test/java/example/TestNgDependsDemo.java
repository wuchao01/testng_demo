package example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDependsDemo {
    @Test
    public void putInA(){
        System.out.println("这是A");
        Assert.fail();
    }

    @Test(dependsOnMethods = "putInA")
    public void putInB(){
        System.out.println("这是B");
    }

    @Test(dependsOnMethods = "putInB")
    public void putInC() {
        System.out.println("这是C");
    }

    @Test(dependsOnMethods = "putInC")
    public void putInD(){
        System.out.println("这是D");
    }
}
