import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RockPaperScissorTest {

    /*
      P1: Paper, P2: Rock => P1 Wins
      P1: Paper, P2: Scissor => P2 Wins
      P1: Paper, P2: Paper => Tie
      P1: Rock, P2: Scissor => P1 Wins
      P1: Scissor, P2: Rock => P2 Wins
     */

    @Test
    void should_return_P1_wins_when_P1_plays_PAPER_and_P2_plays_ROCK() {
        // Given
        Game game = new Game();

        // When
        GameResult gameResult = game.play(Sign.PAPER, Sign.ROCK);

        // Then
        assertThat(GameResult.P1_WINS).isEqualTo(gameResult);
    }
}
