package com.samupra.designpatterns.creation.prototype;

public class MazePrototypeFactory {

    private Maze _prototypeMaze;
    private Wall _prototypeWall;
    private Room _prototypeRoom;
    private Door _prototypeDoor;

    MazePrototypeFactory(Maze m, Wall w, Room r, Door d){
        _prototypeMaze = m;
        _prototypeWall = w;
        _prototypeRoom = r;
        _prototypeDoor = d;
    }

    public Door makeDoor(){
        return _prototypeDoor.clone();
    }

}
