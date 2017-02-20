package main.java.designpatterns.abstractfactory;

/**
 * Created by rodrigodiaz on 2/19/17.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red::fill()");
    }
}
