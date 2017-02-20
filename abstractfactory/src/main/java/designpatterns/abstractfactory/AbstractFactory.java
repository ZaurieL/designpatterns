package main.java.designpatterns.abstractfactory;

/**
 * Created by rodrigodiaz on 2/19/17.
 */
public abstract class AbstractFactory {

    abstract Shape getShape(String shape);
    abstract Color getColor(String color);

}
