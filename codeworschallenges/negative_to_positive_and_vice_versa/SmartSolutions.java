package codeworschallenges.negative_to_positive_and_vice_versa;

public class SmartSolutions {
    public static int[] invert(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
        return array;
    }
}
