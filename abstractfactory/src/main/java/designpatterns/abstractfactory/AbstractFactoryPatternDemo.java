package main.java.designpatterns.abstractfactory;

/**
 * Created by rodrigodiaz on 2/20/17.
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        Shape circle = shapeFactory.getShape("CIRCLE");
        Shape square = shapeFactory.getShape("SQUARE");

        rectangle.draw();
        circle.draw();
        square.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Color red = colorFactory.getColor("RED");
        Color green = colorFactory.getColor("GREEN");
        Color blue = colorFactory.getColor("BLUE");

        red.fill();
        green.fill();
        blue.fill();

    }

}
