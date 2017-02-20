package main.java.designpatterns.factory;

/**
 * Created by rodrigodiaz on 2/19/17.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
