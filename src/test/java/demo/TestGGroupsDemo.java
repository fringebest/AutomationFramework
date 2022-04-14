package demo;

import org.testng.annotations.Test;

@Test(groups = {"AllClassTests"})
public class TestGGroupsDemo {

    @Test(groups = {"sanity"})
    public void test1(){
        System.out.println("This is test 1");
    }

    @Test(groups = {"smoke"})
    public void test2(){
        System.out.println("This is test 2");
    }

    @Test(groups = {"regression"})
    public void test3(){
        System.out.println("This is test 3");
    }

    public void test4(){
        System.out.println("This is test 4");
    }

    public void test5(){System.out.println("This is test 5");}
}
