package TestNG.demoParam;

import org.testng.annotations.*;

public class ClassThree {

    @Parameters({"myUrl","myUsername","myPassword"})
    @BeforeClass
    public void doLogin(String url,String username,String password)
    {
        System.out.println("url="+url);
        System.out.println("username="+username);
        System.out.println("password="+password);
    }

    @Test
    public void classThreeTest1()
    {
        System.out.println("classThreeTest1");
    }
    @Test
    public void classThreeTest2()
    {
        System.out.println("classThreeTest2");
    }
    @Test
    public void classThreeTest3()
    {
        System.out.println("classThreeTest3");
    }
}
