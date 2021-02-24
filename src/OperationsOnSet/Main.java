package OperationsOnSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet result = new HashSet();


        hashSet1.add("A");
        hashSet1.add("B");

        hashSet2.add("B");
        hashSet2.add("C");

        System.out.println(hashSet1.equals(hashSet2));

        HashSetOperations setsOperations = new HashSetOperations();


        result = setsOperations.difference(hashSet1, hashSet2);
        System.out.println(result);
//        result = setsOperations.intersection(hashSet1, hashSet2);
//        System.out.println(result);
//
//        System.out.println(hashSet1);
//        System.out.println(hashSet2);
    }
}
