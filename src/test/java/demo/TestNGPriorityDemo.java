package demo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {

    @Test(priority = 3)
    public void test1(){
        System.out.println("I am inside Test 1");
    }
    //when same priority, alphabetical order is taken into consideration
    @Test(priority = 3)
    public void test2(){
        System.out.println("I am inside Test 2");
    }
    @Test(priority = 1)
    public void test3(){
        System.out.println("I am inside Test 3");
    }
    @Test(priority = 0)
    public void test4(){
        System.out.println("I am inside Test 4");
    }
    //this will run first
    @Test
    public void test5(){
        System.out.println("I am inside Test 5");
    }


}
