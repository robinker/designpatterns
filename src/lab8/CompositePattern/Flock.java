package lab8.CompositePattern;

import lab8.AdaptorPattern.RedheadDuck;
import lab8.DecoratorPattern.DuckSimulator;
import lab8.DecoratorPattern.MallardDuck;
import lab8.DecoratorPattern.Quackable;

import java.util.ArrayList;

public class Flock {
    private ArrayList<Quackable> quackables;

    public Flock(){
        quackables = new ArrayList<>();
    }

    public void add(Quackable q){
        quackables.add(q);
    }

    public void quackAll(){
        boolean first = true;
        for (Quackable q: quackables) {
            if(q instanceof MallardDuck || q instanceof RedheadDuck){
                if(first){
                    q.quack();
                    q.quack();
                    first = false;
                }
                q.quack();
            }
        }
    }
}
