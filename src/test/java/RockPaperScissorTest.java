import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RockPaperScissorTest {

    /*
      P1: Paper, P2: Rock => P1 Wins - Done
      P1: Paper, P2: Scissor => P2 Wins - Done
      P1: Paper, P2: Paper => Tie - Done
      P1: Rock, P2: Scissor => P1 Wins - Skipped
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

    @Test
    void should_return_P2_wins_when_P1_plays_PAPER_and_P2_plays_SCISSOR() {
        // Given
        Game game = new Game();

        // When
        GameResult gameResult = game.play(Sign.PAPER, Sign.SCISSOR);

        // Then
        assertThat(GameResult.P2_WINS).isEqualTo(gameResult);
    }

    @Test
    void should_return_TIE_when_P1_plays_PAPER_and_P2_plays_PAPER() {
        // Given
        Game game = new Game();

        // When
        GameResult gameResult = game.play(Sign.PAPER, Sign.PAPER);

        // Then
        assertThat(GameResult.TIE).isEqualTo(gameResult);
    }

    @Test
    void should_return_P2_wins_when_P1_plays_SCISSOR_and_P2_plays_ROCK() {
        // Given
        Game game = new Game();

        // When
        GameResult gameResult = game.play(Sign.SCISSOR, Sign.ROCK);

        // Then
        assertThat(GameResult.P2_WINS).isEqualTo(gameResult);
    }
}
