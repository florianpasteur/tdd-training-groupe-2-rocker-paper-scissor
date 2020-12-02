public class Game {
    public GameResult play(Sign player1sign, Sign player2sign) {
        if (player1sign.isBeaten(player2sign)) {
            return GameResult.P2_WINS;
        }
        if (player2sign.isBeaten(player1sign)) {
            return GameResult.P1_WINS;
        }
        return GameResult.TIE;
    }

}
