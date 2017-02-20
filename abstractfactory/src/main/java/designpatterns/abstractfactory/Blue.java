package main.java.designpatterns.abstractfactory;

/**
 * Created by rodrigodiaz on 2/19/17.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Blue::fill()");
    }
}
