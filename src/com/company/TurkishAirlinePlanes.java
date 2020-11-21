package com.company;

public class TurkishAirlinePlanes extends Transports {
    private int baggageCapacityForEachPerson;
    private String type;

    public TurkishAirlinePlanes(String name, int creationDate,int baggageCapacityForEachPerson,String type) {
        super(name, creationDate);
        this.baggageCapacityForEachPerson = baggageCapacityForEachPerson;
        this.type = type;
    }

    public int getBaggageCapacityForEachPerson() {
        return baggageCapacityForEachPerson;
    }

    public void setBaggageCapacityForEachPerson(int baggageCapacityForEachPerson) {
        this.baggageCapacityForEachPerson = baggageCapacityForEachPerson;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void print(){
        super.print();
        System.out.println("Baggage Capacity: "+baggageCapacityForEachPerson+"\nType of Transport: "+type);
    }
}
