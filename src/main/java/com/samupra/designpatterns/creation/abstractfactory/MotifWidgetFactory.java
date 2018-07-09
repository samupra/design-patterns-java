package com.samupra.designpatterns.creation.abstractfactory;

public class MotifWidgetFactory extends WidgetFactory {


    public ScrollBar createScrollBar() {
        return new MotifScrollBar();
    }

    public Window createWindow() {
        return new MotifWindow();
    }

}
