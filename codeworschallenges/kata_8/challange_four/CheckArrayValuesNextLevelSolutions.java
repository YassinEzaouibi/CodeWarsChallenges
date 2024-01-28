package codeworschallenges.kata_8.challange_four;

import java.util.Arrays;
import java.util.Collections;

public class CheckArrayValuesNextLevelSolutions {
    // method 1
    // He used in his code the foreach and the condition (8/10)
    public static int countTrueValuesInArray(Boolean[] array){
        int counter = 0;
        for(Boolean inArray: array){
            if (inArray != null && inArray){
                counter = counter + 1;
            }
        }
        return counter;
    }
    // methode 2
    // he used an amazing methode in the collection framework
    public static int countTrueValuesInArrayWithCollection(Boolean[] array){
       return Collections.frequency(Arrays.asList(array), true);
    }
}
