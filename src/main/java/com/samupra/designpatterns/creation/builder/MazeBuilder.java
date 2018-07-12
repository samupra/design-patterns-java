package com.samupra.designpatterns.creation.builder;

abstract class MazeBuilder {
    abstract void buildMaze();
    abstract void buildRoom(int room);
    abstract void buildDoor(int roomFrom, int roomTo);
    abstract Maze getMaze();
}
