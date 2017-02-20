package main.java.designpatterns.abstractfactory;

/**
 * Created by rodrigodiaz on 2/20/17.
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {

        if (factory == null) return null;

        if (factory.equalsIgnoreCase("SHAPE")) return new ShapeFactory();
        else if (factory.equalsIgnoreCase("COLOR")) return new ColorFactory();

        return null;

    }

}
