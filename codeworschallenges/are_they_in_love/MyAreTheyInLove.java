package codeworschallenges.are_they_in_love;

public class MyAreTheyInLove {
    /*
     Timmy & Sarah think they are in love, but around where they live, they will only know once they pick a flower each.
     If one of the flowers has an even number of petals and the other has an odd number of petals it means they are in love.
     Write a function that will take the number of petals of each flower and return true if they are in love and false if they aren't.
    */
    public static boolean isLove(final int flower1, final int flower2) {
        if(isEven(flower1) && !isEven(flower2) || isEven(flower2) && !isEven(flower1)){
            return true;
        }else {
            return false;
        }
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isLove(11,10));
    }
}
