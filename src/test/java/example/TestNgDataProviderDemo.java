package example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgDataProviderDemo {

    @DataProvider(name = "data")
    public Object[][] data(){
        Object[][] objects;
        return objects = new Object[][]{
                {"包裹1",1,0,1,1,1},
                {"包裹2",0,1,1,1,0},
                {"包裹3",1,1,1,1,1},
        };
    }

    @Test(dataProvider = "data")
    public void putInA(String packageName,int aNum,int bNum,int cNum,int dNum,int eNum){
        System.out.println(packageName + "装配:" + aNum);
        System.out.println(packageName + "装配:" + bNum);
        System.out.println(packageName + "装配:" + cNum);
        System.out.println(packageName + "装配:" + dNum);
        System.out.println(packageName + "装配:" + eNum);
    }
}
