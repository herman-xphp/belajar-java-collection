package muslim.dev.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {

    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Eko");
        collection.add("Rahmat");
        collection.add("Yadi");
        collection.addAll(List.of("Herman", "Ahmad", "Andito"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println("REMOVE");
        collection.remove("Eko");
        collection.removeAll(List.of("Rahmat", "Ahmad"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(collection.contains("Herman"));

        System.out.println(collection.containsAll(List.of("Yadi", "Andito")));

        System.out.println(collection.size());
    }
}
