package codeworschallenges.retur_negative;

public class ReturNegative {

    /*
        In this simple assignment you are given a number and have to make it negative.
        But maybe the number is already negative?
        Examples
        Kata.makeNegative(1);  // return -1
        Kata.makeNegative(-5); // return -5
        Kata.makeNegative(0);  // return 0
    */
    public static int makeNegative(final int number){
        if(number >= 0){
            return number - (number*2);
        }else {
            return number;
        }

    }

}
