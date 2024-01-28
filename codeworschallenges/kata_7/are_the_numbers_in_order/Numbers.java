package codeworschallenges.kata_7.are_the_numbers_in_order;

public class Numbers {
    public static boolean isAscOrder(int[] arr) {
        // TODO
       for (int i = 0; i < arr.length - 1; i++) {
           if (arr[i] > arr[i + 1]) {
               return false;
           }
       }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {1,2,3,4,5,0};
        int[] arr2 = {1,6,10,18,2,4,20};
        int[] arr3 = {9,8,7,6,5,4,3,2,1};
        int[] arr4 = {0, 1, 32};
        System.out.println(isAscOrder(arr));
        System.out.println(isAscOrder(arr1));
        System.out.println(isAscOrder(arr2));
        System.out.println(isAscOrder(arr3));
        System.out.println(isAscOrder(arr4));
    }

}
