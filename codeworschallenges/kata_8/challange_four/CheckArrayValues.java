package codeworschallenges.kata_8.challange_four;

import java.util.Arrays;

public class CheckArrayValues {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int j = 0, n = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null) {
                if (arrayOfSheeps[i]){
                    j = j + 1;
                }
            }
        }
        return j;
    }

    public static int countSheepWithStreams(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps).filter(val -> val != null && val == true).count();

    }

    public static void main(String[] args) {
        Boolean [] arrayBo = {true, true, true,
                true, true, true,
                false, true, true,
                false, false, false,
                null
        };
        System.out.println(countSheeps(arrayBo));
        System.out.println(countSheepWithStreams(arrayBo));
    }

}
