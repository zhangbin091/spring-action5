package com.riant;

/**
 * @Classname ProductService
 * @Description TODO
 * @Date 2021/1/30 22:10
 * @Created by 张斌
 */
public class ProductService {
    private InventoryService inventoryService;

    public ProductService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    public InventoryService getInventoryService() {
        return inventoryService;
    }

    public void setInventoryService(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }
}
