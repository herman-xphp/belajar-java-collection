package muslim.dev.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(100);
        // List<String> strings = new LinkedList<>();

        strings.add("Herman");
        strings.add("Sulkifli");
        strings.add("Syawal");
        strings.add("Fhikar");

        strings.set(3, "Andito");
        strings.remove(1);

        System.out.println(strings.get(0));

        for (var value : strings) {
            System.out.println(value);
        }

    }
}
