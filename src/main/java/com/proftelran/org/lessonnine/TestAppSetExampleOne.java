package com.proftelran.org.lessonnine;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestAppSetExampleOne {

    public static void main(String[] args) {

        SortedSet<String> sortedSet = new TreeSet<>();
        // add - add element to set
        sortedSet.add("A");
        sortedSet.add("B");
        sortedSet.add("A");
        sortedSet.add("F");
        sortedSet.add("C");

        System.out.println(sortedSet);
        // last and first - get last and first elements from sorted set (use SortedSet)
        System.out.println("Last element is " + sortedSet.last());
        System.out.println("First element is " + sortedSet.first());
        //contains - check that element exists in set
        System.out.println("Contains E " + sortedSet.contains("E"));
        System.out.println("Contains B " + sortedSet.contains("B"));
        //remove - delete element from set
        sortedSet.remove("B");
        System.out.println(sortedSet);

        // 1 2 4 5 7 3

        /*
             3
            / \
           2   4
          /     \
         1       5

         */
        System.out.println("Iterate with foreach : ");
        for (String value : sortedSet) {
            System.out.print(" " + value);
        }

        System.out.println();
        //Example with own object
        Person person = new Person("One");
        Person person1 = new Person("Ann");
        Set<Person> personSet = new TreeSet<>();
        personSet.add(person);
        personSet.add(person1);
        System.out.println(personSet);
    }
}
