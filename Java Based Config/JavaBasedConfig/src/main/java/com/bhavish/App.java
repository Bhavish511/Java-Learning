package com.bhavish;

import com.bhavish.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        Desktop desk = context.getBean("desktop",Desktop.class); // Default given name
//        Desktop desk = context.getBean("com1",Desktop.class);
//
//        desk.compile();
//        Desktop desk1 = context.getBean("desktop",Desktop.class); // Default given name
//        desk1.compile();

        Alein obj1 = context.getBean(Alein.class);
//        obj1.setAge(20);
        System.out.println(obj1.getAge());
        obj1.code();
    }
}
