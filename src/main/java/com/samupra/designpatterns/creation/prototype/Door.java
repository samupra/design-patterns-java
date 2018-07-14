package com.samupra.designpatterns.creation.prototype;

public class Door {

    private Room _r1;
    private Room _r2;

    public Door(){

    }

    public void initialize(Room r1, Room r2){
        _r1 = r1;
        _r2 = r2;
    }

    public Door(Door other){
        _r1 = other._r1;
        _r2 = other._r2;
    }

    public Door clone(){
        return new Door(this);
    }
}
