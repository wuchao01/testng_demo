package example;

import org.testng.annotations.*;

public class TestNgChaildFlow extends TestNgFlow{

    @BeforeSuite
    public void chaildBeforeSuite(){
        System.out.println("这是chaildBeforeSuite");
    }

    @AfterSuite
    public void chaildAfterSuite(){
        System.out.println("这是chaildAfterSuite");
    }

    @BeforeTest
    public void chaildBeforeTest(){
        System.out.println("这是chaildBeforeTest");
    }

    @AfterTest
    public void chaildAfterTest(){
        System.out.println("这是chaildAfterTest");
    }

    @BeforeClass
    public void chaildBeforeClass(){
        System.out.println("这是chaildBeforeClass");
    }

    @AfterTest
    public void chaildAfterClass(){
        System.out.println("这是chaildAfterClass");
    }

    @BeforeMethod
    public void chaildBeforeMethod(){
        System.out.println("这是chaildBeforeMethod");
    }

    @AfterMethod
    public void chaildAfterMethod(){
        System.out.println("这是chaildAfterMethod");
    }

    @Test
    public void chaildPutInA(){
        System.out.println("这是chaildPutInA");
    }

    @Test
    public void chaildPutInB(){
        System.out.println("这是chaildPutInB");
    }
}
