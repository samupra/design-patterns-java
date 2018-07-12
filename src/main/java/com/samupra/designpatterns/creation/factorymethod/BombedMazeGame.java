package com.samupra.designpatterns.creation.factorymethod;

public class BombedMazeGame extends MazeGame {

    @Override
    public Wall makeWall(){
        return new BombedWall();
    }

    @Override
    public Room makeRoom(int n){
        return new RoomWithABomb(n);
    }

}
