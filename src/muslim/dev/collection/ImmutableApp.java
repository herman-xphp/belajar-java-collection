package muslim.dev.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableApp {

    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Herman");
        mutable.add("Rahmat");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Andito", "Sule", "Andre");
    }
}
