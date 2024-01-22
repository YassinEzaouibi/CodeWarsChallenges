package codeworschallenges.test;

import codeworschallenges.challenge_two_say_hello.SayHello;
import org.junit.jupiter.api.Assertions;

class SayHelloTest {

    @org.junit.jupiter.api.Test
    void sayHello() {
        String[] name = {"Yassin", "Ezaouibi"};
        Assertions.assertEquals("Hello, Yassin Ezaouibi! Welcome to Casablanca, SidiMoumen!",
                SayHello.sayHello(name, "Casablanca", "SidiMoumen"));
    }
}
