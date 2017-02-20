package main.java.designpatterns.factory;

/**
 * Created by rodrigodiaz on 2/19/17.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape rectangle = shapeFactory.getShape("Rectangle");
        Shape circle = shapeFactory.getShape("Circle");
        Shape square = shapeFactory.getShape("Square");

        rectangle.draw();
        circle.draw();
        square.draw();

    }

}
