package com.bhavish.config;

import com.bhavish.Alein;
import com.bhavish.Computer;
import com.bhavish.Desktop;
import com.bhavish.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.bhavish")// Mention the directory
public class AppConfig {
//    @Bean(name = {"com1","desk","Beast"})
//    @Bean(name = "com1")
//    @Bean
//    @Scope("prototype") // By default singleton(On every initialization same object will be use), prototype (on every initializtion new object will be created)
//    public Desktop desktop(){
//        return new Desktop();
//    };
//
//    @Bean
//    @Primary
//    public Laptop laptop(){
//        return new Laptop();
//    }
//    @Bean
//    public Alein alein(@Autowired  Computer com){ //@Qualifier("desktop") to resolve the confusion or use the primary annotation to the prefered class like i use the Laptop
//        Alein obj = new Alein();
//        obj.setAge(21);
//        obj.setCom(com);
//        return obj;
//    }
}
