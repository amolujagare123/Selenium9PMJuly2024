package TestNG.demoParam;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ClassOne {


    @Parameters({"myUrl","myUsername","myPassword"})
    @BeforeClass
    public void doLogin(String url,String username,String password)
    {
        System.out.println("url="+url);
        System.out.println("username="+username);
        System.out.println("password="+password);
    }
    @Test
    public void classOneTest1()
    {
        System.out.println("classOneTest1");
    }
    @Test
    public void classOneTest2()
    {
        System.out.println("classOneTest2");
    }
    @Test
    public void classOneTest3()
    {
        System.out.println("classOneTest3");
    }
}
