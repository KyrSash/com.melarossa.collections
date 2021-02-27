package OperationsOnSet;

import java.util.HashSet;

public class HashSetOperations extends HashSet<String> {
    public HashSet<String> union(HashSet<String> hashSet1, HashSet<String> hashSet2) {
        HashSet<String> result = new HashSet<>();
        result.addAll(hashSet1);
        result.addAll(hashSet2);
        return result;
    }

    public HashSet<String> intersection(HashSet<String> hashSet1, HashSet<String> hashSet2) {
        HashSet<String> result = new HashSet<>();
        result.addAll(hashSet1);
        result.retainAll(hashSet2);
        return result;
    }

    public HashSet<String> minus(HashSet<String> hashSet1, HashSet<String> hashSet2) {
        HashSet<String> result = new HashSet<>();
        result.addAll(hashSet1);
        result.removeAll(hashSet2);
        return result;
    }

    public HashSet<String> difference(HashSet<String> hashSet1, HashSet<String> hashSet2) {
        HashSet<String> result = union(hashSet1, hashSet2);
        HashSet<String> temp1 = intersection(hashSet1, hashSet2);
        result.removeAll(temp1);
        return result;
    }
}