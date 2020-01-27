import java.util.ArrayList;
import java.util.List;

/**
 * Created by MR on 1/22/2020.
 */
public class PreGenericExample {

    public static void main(String[] args) {

        /*List list = new ArrayList<String>();
        list.add("abc");
        list.add(new Integer(5));

        for(Object obj : list){
            String str=(String) obj;
        }*/

        List list2 = new ArrayList<>();
        list2.add("abc");
        list2.add(new Integer(5));

        for(Object obj : list2){
            System.out.println(obj);
        }

    }

}
