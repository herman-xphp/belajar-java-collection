package muslim.dev.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {

    public static void main(String[] args) {

        // Set<String> names = new HashSet<>();
        Set<String> names = new LinkedHashSet<>();

        names.add("Herman");
        names.add("Rahmat");
        names.add("Awaluddin");
        names.add("Herman");
        names.add("Rahmat");
        names.add("Awaluddin");

        for (var name : names) {
            System.out.println(name);
        }
    }
}
