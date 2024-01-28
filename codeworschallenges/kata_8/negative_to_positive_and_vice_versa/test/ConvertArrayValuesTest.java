package codeworschallenges.kata_8.negative_to_positive_and_vice_versa.test;

import codeworschallenges.kata_8.negative_to_positive_and_vice_versa.ConvertArrayValues;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ConvertArrayValuesTest {

    @Test
    void invert() {

        int[] input = new int[] {-1,-2,-3,-4,-5};
        int[] expected = new int[] {1,2,3,4,5};
        assertEquals(Arrays.toString(expected), Arrays.toString(ConvertArrayValues.invert(input)));

        input = new int[] {-1,2,-3,4,-5};
        expected = new int[] {1,-2,3,-4,5};
        assertEquals(Arrays.toString(expected), Arrays.toString(ConvertArrayValues.invert(input)));

        input = new int[] {};
        expected = new int[] {};
        assertEquals(Arrays.toString(expected), Arrays.toString(ConvertArrayValues.invert(input)));

        input = new int[] {0};
        expected = new int[] {0};
        assertEquals(Arrays.toString(expected), Arrays.toString(ConvertArrayValues.invert(input)));
    }
}