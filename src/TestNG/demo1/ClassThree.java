package TestNG.demo1;

import org.testng.annotations.*;

public class ClassThree {


    @BeforeTest
    public void beforeMyTest()
    {
        System.out.println("==== beforeMyTest ====");
    }

    @AfterTest
    public void afterMyTest()
    {
        System.out.println("==== afterMyTest ====");
    }

   /* @BeforeMethod
    public void myBeforeMethod()
    {
        System.out.println("@BeforeMethod");
    }

    @AfterMethod
    public void myAfterMethod()
    {
        System.out.println("@AfterMethod");
    }

    @BeforeClass
    public void myBeforeClassMethod()
    {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public void myAfterClassMethod()
    {
        System.out.println("@AfterClass");
    }
*/

    @Test
    public void classThreeTest1()
    {
        System.out.println("classThreeTest1");
    }
    @Test (groups = "email")
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
