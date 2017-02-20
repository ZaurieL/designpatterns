package main.java.designpatterns.factory;

/**
 * Created by rodrigodiaz on 2/19/17.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {

        if (shapeType == null) return null;

        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }

        return null;

    }

}
