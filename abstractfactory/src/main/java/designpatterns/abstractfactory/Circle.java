package main.java.designpatterns.abstractfactory;

/**
 * Created by rodrigodiaz on 2/19/17.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
