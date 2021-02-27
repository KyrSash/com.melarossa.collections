package OperationsOnSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet1 = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();

        hashSet1.add("A");
        hashSet1.add("B");

        hashSet2.add("B");
        hashSet2.add("C");

        HashSetOperations hashSetOperations = new HashSetOperations();
        HashSet<String> actual = hashSetOperations.union(hashSet1, hashSet2);
        System.out.println(actual);

        actual = hashSetOperations.intersection(hashSet1, hashSet2);
        System.out.println(actual);

        actual = hashSetOperations.minus(hashSet1, hashSet2);
        System.out.println(actual);

        actual = hashSetOperations.difference(hashSet1, hashSet2);
        System.out.println(actual);
    }
}
