package com.zhutianmei;



/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        Hello hello =  new Hello();
        hello.sayHello();
        System.out.println("hello");
    }

}

