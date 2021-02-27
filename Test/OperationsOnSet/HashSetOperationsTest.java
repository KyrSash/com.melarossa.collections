package OperationsOnSet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

class HashSetOperationsTest {
    private HashSetOperations hashSetOperations;
    private HashSet<String> given1;
    private HashSet<String> given2;
    private HashSet<String> union;
    private HashSet<String> intersection;
    private HashSet<String> minus;
    private HashSet<String> difference;

    @BeforeEach
    void setUp() {
        hashSetOperations = new HashSetOperations();
        given1 = new HashSet<>();
        given2 = new HashSet<>();
        given1.add("A");
        given1.add("B");
        given2.add("B");
        given2.add("C");

        union = new HashSet<>();
        union.add("A");
        union.add("B");
        union.add("C");

        intersection = new HashSet<>();
        intersection.add("B");

        minus = new HashSet<>();
        minus.add("A");

        difference = new HashSet<>();
        difference.add("A");
        difference.add("C");
    }

    @AfterEach
    void tearDown() {
        hashSetOperations = null;
    }

    @Test
    void testUnion() {
        HashSet<String> actual = hashSetOperations.union(given1, given2);
        HashSet<String> expected = union;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void intersection() {
        HashSet<String> actual = hashSetOperations.intersection(given1, given2);
        HashSet<String> expected = intersection;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void minus() {
        HashSet<String> actual = hashSetOperations.minus(given1, given2);
        HashSet<String> expected = minus;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void difference() {
        HashSet<String> actual = hashSetOperations.difference(given1, given2);
        HashSet<String> expected = difference;
        Assertions.assertEquals(actual, expected);
    }
}