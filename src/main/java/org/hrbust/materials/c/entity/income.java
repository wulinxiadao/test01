package org.hrbust.materials.c.entity;

import java.time.LocalDate;

public class income {
    private int id;
    private String name;
    private int number;
    private String type;
    private String source;
    private LocalDate date;

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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "income{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", type='" + type + '\'' +
                ", source='" + source + '\'' +
                ", date=" + date +
                '}';
    }
}
