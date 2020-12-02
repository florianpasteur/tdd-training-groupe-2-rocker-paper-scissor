public class Game {
    public GameResult play(Sign player1sign, Sign player2sign) {
        if (player1sign == Sign.PAPER && player2sign == Sign.SCISSOR) {
            return GameResult.P2_WINS;
        }
        return GameResult.P1_WINS;
    }
}
