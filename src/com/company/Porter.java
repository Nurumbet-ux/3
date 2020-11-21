package com.company;

public class Porter extends Transports {
    private int truckCarry;
    private String from;

    public Porter(String name, int creationDate,int truckCarry,String from) {
        super(name, creationDate);
        this.truckCarry = truckCarry;
        this.from = from;
    }

    public int getTruckCarry() {
        return truckCarry;
    }

    public void setTruckCarry(int truckCarry) {
        this.truckCarry = truckCarry;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
       this.from = from;
    }
    public void print(){
        super.print();
        System.out.println("Carry: "+truckCarry+"\nFrom: "+from);
    }
}
