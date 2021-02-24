package OperationsOnSet;

import java.util.HashSet;

public class HashSetOperations extends HashSet {
    public HashSet union(HashSet hashSet1, HashSet hashSet2) {
        HashSet result = new HashSet();

        result.addAll(hashSet1);
        result.addAll(hashSet2);
        return result;
    }

    public HashSet intersection(HashSet hashSet1, HashSet hashSet2) {
        HashSet result = new HashSet();

        result.addAll(hashSet1);
        result.retainAll(hashSet2);
        return result;
    }

    public HashSet minus(HashSet hashSet1, HashSet hashSet2) {
        HashSet result = new HashSet();

        result.addAll(hashSet1);
        result.removeAll(hashSet2);
        return result;
    }

    public HashSet difference(HashSet hashSet1, HashSet hashSet2) {
        HashSet temp1 = new HashSet();
        HashSet result = new HashSet();

        result = union(hashSet1, hashSet2);
        temp1 = intersection(hashSet1, hashSet2);
        result.removeAll(temp1);
        return result;
    }
}
