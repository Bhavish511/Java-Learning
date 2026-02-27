package com.bhavish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alein obj = new Alein();
//        Alein obj = (Alein) context.getBean("alien");
        Alein obj = context.getBean("alien", Alein.class);

//        obj.setAge(21);
        System.out.println(obj.getAge());
        obj.code();

        Desktop obj2 = context.getBean(Desktop.class);

    }
}
