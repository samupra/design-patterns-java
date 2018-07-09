package com.samupra.designpatterns.creation.abstractfactory;

public class Main {

    enum FactoryType {
        PM_FACTORY, MOTIF_FACTORY
    }

    public static void main(String args[]){
        FactoryType factoryType = FactoryType.valueOf(args[0].toUpperCase());

        WidgetFactory widgetFactory;

        if(factoryType == FactoryType.MOTIF_FACTORY){
            widgetFactory = new MotifWidgetFactory();
        } else {
            widgetFactory = new PMWidgetFactory();
        }

        ScrollBar scrollBar = widgetFactory.createScrollBar();
        Window window = widgetFactory.createWindow();

        scrollBar.printIdentity();
        window.printIdentity();
    }

}
