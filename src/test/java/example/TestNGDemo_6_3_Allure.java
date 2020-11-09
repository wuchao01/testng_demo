package example;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import util.Calculator;

import static org.testng.Assert.assertEquals;

@Epic("Epic")
@Feature(value = "计算器项目冒烟测试用例")
public class TestNGDemo_6_3_Allure {
    @Issue("www.baidu.com")
    @Story("story")
    @Severity(value = SeverityLevel.BLOCKER)
    @Link(value = "爱测社区",type = "myLink",url = "https://ceshiren.com/t/topic/7611/4")
    @Test()
    public void addTest() throws InterruptedException {
        int result = Calculator.add(4,2);
        Allure.addAttachment("pick","image/png",this.getClass().getResourceAsStream("/pick.png"),".png");
        System.out.println("完成加法计算，结果为："+result);
        assertEquals(6,result);
    }

    @Test()
    public void subtractTest() throws InterruptedException {
        int result = Calculator.subtract(4,2);
        System.out.println("完成减法计算，结果为："+result);
        assertEquals(2,result);
    }

}
