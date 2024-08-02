package TestNG.demoParam;

import org.testng.annotations.*;

public class ClassTwo {

    @Parameters({"myUrl","myUsername","myPassword"})
    @BeforeClass
    public void doLogin(String url,String username,String password)
    {
        System.out.println("url="+url);
        System.out.println("username="+username);
        System.out.println("password="+password);
    }

    @Test
    public void classTwoTest1()
    {
        System.out.println("classTwoTest1");
    }
    @Test
    public void classTwoTest2()
    {
        System.out.println("classTwoTest2");
    }
    @Test
    public void classTwoTest3()
    {
        System.out.println("classTwoTest3");
    }
}
