package programmer.copas.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
//        List<String> strings = new LinkedList<>();

        strings.add("Sul");
        strings.add("Herman");
        strings.add("Ardi");

        strings.set(0, "Dito");

        strings.remove(1);

        System.out.println(strings.get(0));

        for (var value : strings){
            System.out.println(value);
        }

    }
}
