package codeworschallenges.AreTheyInLove.test;

import codeworschallenges.AreTheyInLove.MyAreTheyInLove;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyAreTheyInLoveTest {

    @Test
    void isLove() {
        Assertions.assertEquals(false, MyAreTheyInLove.isLove(2,2));
        assertEquals(true, MyAreTheyInLove.isLove(0,1));
        assertEquals(true, MyAreTheyInLove.isLove(1,0));
        assertEquals(false, MyAreTheyInLove.isLove(11,11));
    }
}