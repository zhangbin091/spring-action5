package com.riant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname JavaConfig
 * @Description TODO
 * @Date 2021/1/30 22:55
 * @Created by 张斌
 */

@Configuration
public class JavaConfig {
    @Bean
    public InventoryService inventoryService(){
        return new InventoryService("小三");
    }

    @Bean
    public ProductService productService(InventoryService inventoryService){
        return new ProductService(inventoryService);
    }
}
