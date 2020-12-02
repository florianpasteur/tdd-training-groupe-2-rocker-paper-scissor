public class Game {
    public GameResult play(Sign player1sign, Sign player2sign) {
        if (player1sign.isBeaten(player2sign)) {
            return GameResult.P2_WINS;
        }
        if (player1sign == Sign.PAPER && player2sign == Sign.PAPER) {
            return GameResult.TIE;
        }
        return GameResult.P1_WINS;
    }

}
