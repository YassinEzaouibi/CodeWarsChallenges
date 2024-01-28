package codeworschallenges.kata_8.boolean_string;

public class BooleanToString {
    // in this exercise I want to convert boolean to string
    public static String convrter(boolean b) {
        return String.valueOf(b);
    }

    public static void main(String[] args) {
        System.out.println(convrter(true));
        System.out.println("true".equals(convrter(true)) + " should be true");
        System.out.println(convrter(false));
    }
}
