package java.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.ChallangeFour.CheckArrayValues;

import static org.junit.jupiter.api.Assertions.*;

class CheckArrayValuesTest {
    Boolean [] arrayBo = {true, true, true,
            true, true, true,
            false, true, true,
            false, false, false,
            null
    };
    @Test
    void countSheeps() {
        Assertions.assertEquals(8, CheckArrayValues.countSheeps(arrayBo));
        assertNotEquals(0, CheckArrayValues.countSheepWithStreams(arrayBo));

    }

    @Test
    void countSheepWithStreams() {
        assertEquals(8, CheckArrayValues.countSheepWithStreams(arrayBo));
        assertNotEquals(0, CheckArrayValues.countSheepWithStreams(arrayBo));
    }
}