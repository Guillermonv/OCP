package com.example.OCP.advancedClassDesing.herencia;

/**
 * Created by guille on 10/20/18.
 */

class Widget {

    String data = "data";
    public void doWidgetStuff() {
        System.out.println(data);
    }

}

class GoodWidget extends Widget{
    String data = "big data";

    public void doWidgetStuff() {
    }
}

public class WidgetUser{
    public static void main(String[] args) {
        Widget w = new GoodWidget();
        ((Widget)w).doWidgetStuff();
        w.doWidgetStuff();
        System.out.print(w.data);
    }

}