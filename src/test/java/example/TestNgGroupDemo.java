package example;

import org.testng.annotations.Test;

public class TestNgGroupDemo {
    @Test(groups = {"group01"})
    public void putInA(){
        System.out.println("这是A");
    }

    @Test(groups = {"group01"})
    public void putInB(){
        System.out.println("这是B");
    }

    @Test(groups = {"group01","group02"})
    public void putInC(){
        System.out.println("这是C");
    }

    @Test(groups = {"group02"})
    public void putInD(){
        System.out.println("这是D");
    }

    @Test(groups = {"group02"})
    public void putInE(){
        System.out.println("这是E");
    }
}
