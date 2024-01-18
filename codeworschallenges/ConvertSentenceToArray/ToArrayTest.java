package codeworschallenges.ConvertSentenceToArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToArrayTest {

    @Test
    void converter() {
        assertArrayEquals(new String[]{"me", "and"}, ToArray.converter("me and"));
    }
}