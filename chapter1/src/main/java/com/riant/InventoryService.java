package com.riant;

/**
 * @Classname InventoryService
 * @Description TODO
 * @Date 2021/1/30 22:09
 * @Created by 张斌
 */
public class InventoryService {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InventoryService(String name) {
        this.name = name;
    }
}
