package com.samupra.designpatterns.creation.factorymethod;

public class MazeGame {

    Maze createMaze(){
        Maze maze = makeMaze();

        Room r1 = makeRoom(1);
        Room r2 = makeRoom(2);
        Door theDoor = makeDoor(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setSide(Side.NORTH, makeWall());
        r2.setSide(Side.EAST, theDoor);

        return maze;
    }

    Maze makeMaze(){
        return new Maze();
    }

    Room makeRoom(int n){
        return new Room(n);
    }

    Door makeDoor(Room r1, Room r2){
        return new Door(r1, r2);
    }

    Wall makeWall(){
        return new Wall();
    }
}
