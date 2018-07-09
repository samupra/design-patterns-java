package com.samupra.designpatterns.creation.abstractfactory;

public class PMWidgetFactory extends WidgetFactory {

    public ScrollBar createScrollBar() {
        return new PMScrollBar();
    }

    public Window createWindow() {
        return new PMWindow();
    }

}
