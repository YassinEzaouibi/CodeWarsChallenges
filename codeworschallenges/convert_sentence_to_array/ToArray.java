package codeworschallenges.convert_sentence_to_array;

public class ToArray {
    /*
        Write a function to split a string and convert it into an array of words.
        Examples (Input ==> Output):
        "Robin Singh" ==> ["Robin", "Singh"]
        "I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
    */
      public static String[] converter(String sentence){
        return sentence.split(" ");
    }

}
