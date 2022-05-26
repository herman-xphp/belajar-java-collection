package programmer.copas.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("Herman");
        collection.add("Sul");
        collection.add("Andito");
        collection.add("Ariadi");
        collection.addAll(List.of("Programmer", "Copas"));

        for (var value : collection){
            System.out.println(value);
        }

        System.out.println("REMOVE");

        collection.remove("Herman");
        collection.removeAll(List.of("Programmer", "Copas"));

        for (var value : collection){
            System.out.println(value);
        }

        System.out.println(
                collection.contains("Sul")
        );

        System.out.println(
                collection.containsAll(List.of("Andito", "Ariadi"))
        );
    }
}
