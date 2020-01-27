package generic.comparator;

import generic.comparator.model.Developer;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by MR on 1/22/2020.
 */
public class ComparatorExample {

    public static void main(String[] args) {

        List<Developer> listDevs = getDevelopers();

        System.out.println("Before Sort");
        for (Developer developer : listDevs) {
            System.out.println(developer);
        }

        //lambda here!
        listDevs.sort((Developer o1, Developer o2)-> Long.compare(o1.getSalary(), o2.getSalary()));

        System.out.println("after sort");

        // and here!
        listDevs.forEach((developer)->System.out.println(developer.getSalary()));

        //sort by salary
        Collections.sort(listDevs, new Comparator<Developer>() {
            @Override
            public int compare(Developer o1, Developer o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });

        Comparator<Developer> comparator = (o1, o2)->o1.getName().compareTo(o2.getName());

        Comparator<Developer> groupByComparator = Comparator.comparing(Developer::getName);

        //Parallel Sorting
        Developer[] developers = listDevs.toArray(new Developer[listDevs.size()]);

        //Parallel sorting
        Arrays.parallelSort(developers, groupByComparator);

        System.out.println(developers);

    }

    static List<Developer> getDevelopers(){

        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("mrkhatami", 6000L));
        result.add(new Developer("masouddev", 9000L));
        result.add(new Developer("khalilstu", 7000L));
        result.add(new Developer("stevenhw4k",12000L));
        result.add(new Developer("iris", 17000L));
        result.add(new Developer("david", 11000L));

        return result;
    }

}
