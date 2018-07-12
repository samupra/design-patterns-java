package com.samupra.designpatterns.creation.factorymethod;

public class Door {

    private Room _r1;
    private Room _r2;

    public Door(Room r1, Room r2){
        _r1 = r1;
        _r2 = r2;
    }
}
