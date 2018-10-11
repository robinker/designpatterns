package AbstractFactoryPattern;

import DecoratorPattern.DuckSimulator;
import DecoratorPattern.Quackable;
import DecoratorPattern.RedheadDuck;

public class DuckFactory1 {

    public Quackable makeDuck(){
        return new RedheadDuck();
    }

}
