package muslim.dev.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {

    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> singleton = Collections.singleton("Satu");

        Set<String> mutable = new HashSet<>();
        mutable.add("Herman");
        mutable.add("Rahmat");
        Set<String> immutabel = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Andito", "Sulkifli");

        // set.add("Alif"); Error
        // set.remove("Sulkifli"); Error
    }
}
