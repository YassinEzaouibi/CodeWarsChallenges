package codeworschallenges.challange_one_rock_paper_scissors;

public class OtherKata {
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";
    public static final String ROCK = "rock";

    public static final String P1WON = "Player 1 Won!";
    public static final String P2WON = "Player 2 Won!";
    public static final String DRAW = "Draw!";

    public static String rockPaperScissors(String p1, String p2) {
        if(p1 == p2) return "Draw!";
        int p = (p1 + p2).equals("scissorspaper") || (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") ? 1 : 2;
        return "Player " + p + "Won!";
    }
    public static String rps(String p1, String p2) {
        return p1.equals(p2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(p1+p2)?1:2) + " won!";
    }

    public static String favourtRps(String p1, String p2) {
        switch (p1) {
            case PAPER:
                return p2 == p1 ? DRAW : (p2 == SCISSORS ? P2WON : P1WON);
            case SCISSORS:
                return p2 == p1 ? DRAW : (p2 == ROCK ? P2WON : P1WON);
            case ROCK:
                return p2 == p1 ? DRAW : (p2 == PAPER ? P2WON : P1WON);
            default:
                return "Please enter an item";

        }
    }
    public static void main(String[] args) {
        System.out.println(rockPaperScissors("rock","scissors"));
        System.out.println(rps("rock","scissors"));
        System.out.println(favourtRps("rock","scissors"));
    }
}
