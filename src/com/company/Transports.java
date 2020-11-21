package com.company;

public class Transports implements Printable{
    private String name;
    private int creationDate;

    public Transports(String name, int creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(int creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public void print() {
        System.out.println("name: "+name+"\nDate of Creation: "+creationDate);
    }
}
