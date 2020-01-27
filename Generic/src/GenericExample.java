/**
 * Created by MR on 1/22/2020.
 */
public class GenericExample<T> {

    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public static void main(String[] args) {
        GenericExample<Integer> genericExample = new GenericExample<>();
        genericExample.setT(new Integer(1234));
        Integer value = genericExample.getT();
        System.out.println(value);

        GenericExample<String> genericExample2 = new GenericExample<>();
        genericExample2.setT(String.valueOf(4321));
        String value2 = genericExample2.getT();
        System.out.println(value2);
    }
}
