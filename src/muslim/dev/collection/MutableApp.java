package muslim.dev.collection;

import java.util.List;

import muslim.dev.collection.data.Person;

public class MutableApp {

    public static void main(String[] args) {

        Person person = new Person("Herman");
        person.addHobby("Game");
        person.addHobby("Coding");

        doSomethingWithHobbies(person.getHobbies());

        for (var value : person.getHobbies()) {
            System.out.println(value);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Bukan Hobby");
    }
}
