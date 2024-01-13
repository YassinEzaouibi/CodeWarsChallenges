package ChallengeTwoSayHello.test;

import ChallengeTwoSayHello.SayHello;
import org.junit.jupiter.api.Assertions;

class SayHelloTest {

    @org.junit.jupiter.api.Test
    void sayHello() {
        String[] name = {"Yassin", "Ezaouibi"};
        Assertions.assertEquals("Hello, Yassin Ezaouibi! Welcome to Casablanca, SidiMoumen!",
                SayHello.sayHello(name, "Casablanca", "SidiMoumen"));
    }
}
