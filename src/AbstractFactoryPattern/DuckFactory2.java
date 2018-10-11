package AbstractFactoryPattern;

import DecoratorPattern.MallardDuck;
import DecoratorPattern.QuackCounter;
import DecoratorPattern.Quackable;

public class DuckFactory2  {


    public Quackable makeDuck(){
        return new QuackCounter(new MallardDuck());
    }

}
