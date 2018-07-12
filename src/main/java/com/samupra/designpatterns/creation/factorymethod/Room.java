package com.samupra.designpatterns.creation.factorymethod;

public class Room {

    private int _identifier;
    // Could be wall or door. whatever?
    public void setSide(Side side, Object any){

    }

    Room(int identifier){
        _identifier = identifier;
    }
}
