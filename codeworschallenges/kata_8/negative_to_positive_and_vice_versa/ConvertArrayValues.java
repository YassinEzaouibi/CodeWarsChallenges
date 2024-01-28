package codeworschallenges.kata_8.negative_to_positive_and_vice_versa;

public class ConvertArrayValues {
    public static int[] invert(int[] array) {
        int[] outPut = new int[array.length];
        for(int i = 0; i < array.length; i++){
            if (array[i] >= 0){
                outPut[i] = (array[i] - array[i] * 2);
            }else if (array[i] < 0) {
                outPut[i] = Math.abs(array[i]);
            }
        }
        return outPut;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,0};
        int[] arrays = {-1,2,-3,4,5};

        for(int num: invert(array)){
            System.out.println(num);
        }
        System.out.println();
        for(int num: invert(arrays)){
            System.out.println(num);
        }
    }
}
