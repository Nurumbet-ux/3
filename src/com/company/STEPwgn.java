package com.company;

public class STEPwgn extends Transports{
    private int seats;
    private String model;

    public STEPwgn(String name, int creationDate,int seats,String model) {
        super(name, creationDate);
        this.seats = seats;
        this.model = model;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void print(){
        super.print();
        System.out.println("Seats: "+seats+"\nModel: "+model);
    }
}
