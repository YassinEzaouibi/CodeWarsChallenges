package codeworschallenges.ReturNegative.test;

import codeworschallenges.ReturNegative.ReturNegative;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReturNegativeTest {

    @Test
    void makeNegative() {
        Assertions.assertEquals(-5, ReturNegative.makeNegative(5));
        assertEquals(-5, ReturNegative.makeNegative(5));
    }
}