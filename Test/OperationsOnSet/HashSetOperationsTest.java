package OperationsOnSet;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

class HashSetOperationsTest {
    private HashSetOperations hashSetOperations;
    private HashSet given1;
    private HashSet given2;
    private HashSet union;
    private HashSet intersection;
    private HashSet minus;
    private HashSet difference;

    @BeforeEach
    void setUp() {
        hashSetOperations = new HashSetOperations();
        given1 = new HashSet();
        given2 = new HashSet();
        given1.add("A");
        given1.add("B");
        given2.add("B");
        given2.add("C");

        union = new HashSet();
        union.add("A");
        union.add("B");
        union.add("C");

        intersection = new HashSet();
        intersection.add("B");

        minus = new HashSet();
        minus.add("A");

        difference = new HashSet();
        difference.add("A");
        difference.add("C");
    }

    @AfterEach
    void tearDown() {
        hashSetOperations = null;
    }

    @Test
    void testUnion() {
        HashSet actual = hashSetOperations.union(given1, given2);
        HashSet expected = union;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void intersection() {
        HashSet actual = hashSetOperations.intersection(given1, given2);
        HashSet expected = intersection;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void minus() {
        HashSet actual = hashSetOperations.minus(given1, given2);
        HashSet expected = minus;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void difference() {
        HashSet actual = hashSetOperations.difference(given1, given2);
        HashSet expected = difference;
        Assertions.assertEquals(actual, expected);
    }
}