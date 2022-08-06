package org.hrbust.materials.c.entity;

public class goods {
    private int id;
    private String name;
    private int inventory;
    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "goods{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", inventory=" + inventory +
                ", type='" + type + '\'' +
                '}';
    }
}
