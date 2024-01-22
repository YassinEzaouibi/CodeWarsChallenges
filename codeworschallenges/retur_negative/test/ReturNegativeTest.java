package codeworschallenges.retur_negative.test;

import codeworschallenges.retur_negative.ReturNegative;
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