package lab8.AbstractFactoryPattern;

import lab8.DecoratorPattern.DuckSimulator;
import lab8.DecoratorPattern.Quackable;
import lab8.DecoratorPattern.RedheadDuck;

public class DuckFactory1 {

    public Quackable makeDuck(){
        return new RedheadDuck();
    }

}
