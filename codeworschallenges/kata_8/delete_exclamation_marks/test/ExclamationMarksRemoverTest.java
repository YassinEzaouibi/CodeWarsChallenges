package codeworschallenges.kata_8.delete_exclamation_marks.test;

import codeworschallenges.kata_8.delete_exclamation_marks.ExclamationMarksRemover;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExclamationMarksRemoverTest {

    @Test
    void remover() {
            assertEquals("Hello World", ExclamationMarksRemover.remover("Hello World!"));
            assertEquals("Hello 1 World", ExclamationMarksRemover.remover("Hello!! 1! World!"));
    }
}