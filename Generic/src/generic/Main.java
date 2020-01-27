package generic;

import generic.type.GenericType;
import sun.net.www.content.text.Generic;

/**
 * Created by MR on 1/22/2020.
 */
public class Main {

    static Object object;

    static {
        // todo : initialize object
    }

    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.setX(1);

        Parent parent1 = new Math();
        // todo : access methods
        Parent parent2 = new Physic();

        if(parent1 instanceof Parent &&
                parent2 instanceof Parent)
            System.out.println("They're parent childs!");
        else
            System.err.println("Something went wrong!!");

        /*GenericType type = new GenericType<Parent>();
        type.setT(parent);
        Parent p = type.getT();
        System.out.println(p.getX());*/

        GenericType type = new GenericType<Math>();
        type.set(parent1);
        Parent m = (Parent) type.get();
        System.out.println(m.getX());

        System.out.println(object);


    }
}
