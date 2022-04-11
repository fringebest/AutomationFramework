package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedTests {

    @Test
    public void test1(){
        System.out.println("Inside test 1");
    }

    @Test
    public void test2(){
        System.out.println("Inside test 1");
        Assert.assertTrue(false);
    }
}
