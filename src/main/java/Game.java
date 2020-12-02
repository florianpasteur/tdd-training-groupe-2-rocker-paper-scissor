public class Game {
    public GameResult play(Sign player1sign, Sign player2sign) {
        if (beats(player1sign, player2sign)) {
            return GameResult.P2_WINS;
        }
        if (player1sign == Sign.PAPER && player2sign == Sign.PAPER) {
            return GameResult.TIE;
        }
        return GameResult.P1_WINS;
    }

    private boolean beats(Sign player1sign, Sign player2sign) {
        return player1sign.beats(player2sign);
    }
}
