package org.prog.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetDemo {

    public static void main(String... args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("a");
        hashSet.add("a");
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("a"));
        List<String> strings = new ArrayList<>(hashSet);
        System.out.println(strings.get(0));
    }

}
