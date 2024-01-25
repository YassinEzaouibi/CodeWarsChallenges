package codeworschallenges.dna;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DnaTest {
    @Test
    public void testDna() throws Exception {
        Dna b = new Dna();
        assertEquals("UUUU", b.dnaToRna("TTTT"));
    }

    @Test
    public void testDna2() throws Exception {
        Dna b = new Dna();
        assertEquals("GCAU", b.dnaToRna("GCAT"));
    }
}