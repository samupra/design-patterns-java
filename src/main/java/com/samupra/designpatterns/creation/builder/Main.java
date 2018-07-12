package com.samupra.designpatterns.creation.builder;

public class Main {

    public static void main(String args[]){
        CountingMazeBuilder builder = new CountingMazeBuilder();

        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1, 2);
        builder.buildRoom(3);

        Counts counts = builder.getCounts();

        System.out.println("There are " + counts.doors + " doors");
        System.out.println("There are " + counts.rooms + " rooms");
    }

}
