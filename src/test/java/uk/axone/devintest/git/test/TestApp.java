package uk.axone.devintest.git.test;

import org.testng.annotations.Test;

public class TestApp {

    @Test
    public void test1(){
        System.out.println("Running test 1");
    }

    private void doSomething(){
        System.out.println("doing something");
    }

    @Test
    public void test2(){
        System.out.println("Running test 2");
    }

    @Test
    public void test3(){
        System.out.println("Running test 3");
    }
    @Test
    public void test4inDev(){
        System.out.println("Running test 4");
    }

}
