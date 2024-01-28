package codeworschallenges.kata_8.challange_one_rock_paper_scissors;

public class MyKata {
    public static String rockPaperScissors(String p1, String p2) {
        String result = null;
        if (p1 == p2){
            result = "Draw!";
        } else if (p1 == "scissors" && p2 == "paper" || p1 == "paper" && p2 == "rock" || p1 == "rock" && p2 == "scissors") {
            result = "Player 1 Won!";
        }else {
            result = "Player 2 Won!";
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(rockPaperScissors("rock","scissors"));
    }
}
