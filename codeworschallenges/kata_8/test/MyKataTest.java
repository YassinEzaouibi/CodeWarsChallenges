package codeworschallenges.kata_8.test;

import codeworschallenges.kata_8.challange_one_rock_paper_scissors.MyKata;
import codeworschallenges.kata_8.challange_one_rock_paper_scissors.OtherKata;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyKataTest {

    @Test
    void test1() {
        Assertions.assertEquals("Player 1 Won!", OtherKata.favourtRps("scissors","paper"));
        Assertions.assertEquals("Player 1 Won!", OtherKata.favourtRps("paper","rock"));
        Assertions.assertEquals("Player 1 Won!", OtherKata.favourtRps("rock","scissors"));
    }
    @Test
    void test2() {
        Assertions.assertEquals("Player 2 Won!", MyKata.rockPaperScissors("scissors","rock"));
        Assertions.assertEquals("Player 2 Won!", MyKata.rockPaperScissors("paper","scissors"));
        Assertions.assertEquals("Player 2 Won!", MyKata.rockPaperScissors("rock","paper"));
    }
    @Test
    void test3() {
        Assertions.assertEquals("Draw!", MyKata.rockPaperScissors("scissors","scissors"));
        Assertions.assertEquals("Draw!", MyKata.rockPaperScissors("paper","paper"));
        Assertions.assertEquals("Draw!", MyKata.rockPaperScissors("rock","rock"));
    }
}