package muslim.dev.collection;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import muslim.dev.collection.data.Person;
import muslim.dev.collection.data.PersonComparator;

public class SortedSetApp {

    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(new Person("Herman"));
        people.add(new Person("Ahmad"));
        people.add(new Person("Supriadi"));

        for (Person person : people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        // sortedSet.add(new Person("Eko"));
    }
}
