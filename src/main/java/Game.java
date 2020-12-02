public class Game {
    public GameResult play(Sign player1sign, Sign player2sign) {
        if (player1sign == Sign.ROCK && player2sign == Sign.PAPER) {
            return  GameResult.P2_WINS;
        }
        if (player1sign == Sign.SCISSOR && player2sign == Sign.ROCK) {
            return  GameResult.P2_WINS;
        }
        if (player1sign == Sign.PAPER && player2sign == Sign.PAPER) {
            return GameResult.TIE;
        }
        if (player1sign == Sign.PAPER && player2sign == Sign.SCISSOR) {
            return GameResult.P2_WINS;
        }
        return GameResult.P1_WINS;
    }
}
