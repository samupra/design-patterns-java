package com.samupra.designpatterns.creation.singleton;

public class MazeFactory {

    private static MazeFactory _instance = null;

    protected MazeFactory(){

    }

    public MazeFactory instance(){
        if(_instance == null){
            _instance = new MazeFactory();
        }

        return _instance;
    }

}
