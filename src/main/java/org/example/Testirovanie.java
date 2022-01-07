package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testirovanie {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
            new ClassPathXmlApplicationContext("ApplicationContext.xml");

        User testBean2 = classPathXmlApplicationContext.getBean("testBean2", User.class);

        System.out.println(testBean2.nameIs());



        classPathXmlApplicationContext.close();
    }
}
