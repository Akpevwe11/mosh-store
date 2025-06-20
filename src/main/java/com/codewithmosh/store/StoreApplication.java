package com.codewithmosh.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(StoreApplication.class, args);
       var orderService = context.getBean(OrderService.class);
       var orderService2 = context.getBean(OrderService.class);
       orderService.placeOrder();
       context.close();


       // var manager = context.getBean(NotificationManager.class);
       // manager.sendNotification("This is a test");

    }

}
