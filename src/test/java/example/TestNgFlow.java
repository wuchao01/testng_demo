package example;

import org.testng.annotations.*;

public class TestNgFlow {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("这是beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("这是afterSuite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("这是beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("这是afterTest");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("这是beforeClass");
    }

    @AfterTest
    public void afterClass(){
        System.out.println("这是afterClass");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是beforeMethod");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是afterMethod");
    }

    @Test
    public void putInA(){
        System.out.println("这是A");
    }

    @Test
    public void putInB(){
        System.out.println("这是B");
    }
}
