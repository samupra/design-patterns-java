package com.samupra.designpatterns.creation.factorymethod;

public class Main {

    public static void main(String[] args){
        BombedMazeGame bombedMazeGame = new BombedMazeGame();

        Room r1 = bombedMazeGame.makeRoom(1);
        Wall w1 = bombedMazeGame.makeWall();

        System.out.println(r1.getClass());
    }

}
