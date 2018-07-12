package com.samupra.designpatterns.creation.factorymethod;

import java.util.ArrayList;

public class Maze {

    ArrayList<Room> rooms = new ArrayList<Room>();

    public void addRoom(Room r){
        rooms.add(r);
    }

}
