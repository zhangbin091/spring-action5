package com.riant.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Classname DemoTest
 * @Description TODO
 * @Date 2021/1/30 22:52
 * @Created by 张斌
 */
public class DemoTest {
    public static void main(String[] args) {
        test2();
    }

    public static void test1(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("beans.xml");
        ProductService productService = applicationContext.getBean(ProductService.class);
        InventoryService inventoryService=productService.getInventoryService();
        System.out.println(inventoryService.getName());
    }

    public static void test2() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        ProductService productService = applicationContext.getBean(ProductService.class);
        InventoryService inventoryService=productService.getInventoryService();
        System.out.println(inventoryService.getName());
    }
}
