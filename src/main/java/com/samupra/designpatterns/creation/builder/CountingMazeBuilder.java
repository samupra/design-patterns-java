package com.samupra.designpatterns.creation.builder;

public class CountingMazeBuilder extends MazeBuilder {

    private int _doors;
    private int _rooms;

    public CountingMazeBuilder() {
        _doors = _rooms = 0;
    }

    void buildMaze() {

    }

    void buildRoom(int room) {
        _rooms++;
    }

    void buildDoor(int roomFrom, int roomTo) {
        _doors++;
    }

    Maze getMaze() {
        return null;
    }

    Counts getCounts(){
        return new Counts(_doors, _rooms);
    }
}

