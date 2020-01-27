package generic.comparator;

import generic.Math;
import generic.Parent;
import generic.type.GenericType;

/**
 * Created by MR on 1/27/2020.
 */
public class GenericMethods {

    //Java Generic Method
    public static <T extends Parent> boolean isEqual(GenericType<T> g1, GenericType<T> g2) {
        return g1.get().equals(g2.get());
    }

    public static void main(String args[]) {
        GenericType<Math> g1 = new GenericType<>();
        g1.set(new Math());

        GenericType<Math> g2 = new GenericType<>();
        g2.set(new Math());

        boolean isEqual = GenericMethods.<Math>isEqual(g1, g2);

        System.out.println(isEqual);

        //above statement can be written simply as
        isEqual = GenericMethods.isEqual(g1, g2);
        System.out.println(isEqual);
        //This feature, known as type inference, allows you to invoke a generic method as an ordinary method, without specifying a type between angle brackets.
        //Compiler will infer the type that is needed
    }
}