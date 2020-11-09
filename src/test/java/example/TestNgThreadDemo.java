package example;

import org.testng.annotations.Test;

public class TestNgThreadDemo {
    @Test
    public void putInA(){
        System.out.println("这是A");
    }

    @Test
    public void putInB(){
        System.out.println("这是B");
    }

    @Test(threadPoolSize = 5,invocationCount = 5,timeOut = 50000)
    public void putInC() throws InterruptedException {
        Thread.sleep(1000);
        long id = Thread.currentThread().getId();
        System.out.println("id--->" + id + "这是C");
    }

    @Test
    public void putInD(){
        System.out.println("这是D");
    }
}
