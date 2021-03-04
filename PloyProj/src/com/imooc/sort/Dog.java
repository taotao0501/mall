package com.imooc.sort;

public class Dog {
    private String name;
    private int month;
    private String species;

    public Dog(String name,int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "[名字：" + name + ", 年龄：" + month + ", 品种：" + species + "]";
    }

}
