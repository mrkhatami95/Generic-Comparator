package generic.type;

import generic.Parent;

/**
 * Created by mrkhatami on 1/22/2020.
 */
public class GenericType<T extends Parent> {

    private T t;

    public T get() {
        return t;
    }

    public void set(T t) {
        this.t = t;
    }
}
