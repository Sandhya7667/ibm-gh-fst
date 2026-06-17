package Rps;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RockPaperScissorsTest {

    @Test
    void testRockBeatsScissors() {

        RockPaperScissors game = new RockPaperScissors();

        String result =
                game.determineWinner("rock", "scissors");

        assertEquals("player", result);
    }
        @Test
        void testPaperPaperTie() {
            RockPaperScissors game = new RockPaperScissors();

            assertEquals(
                    "tie",
                    game.determineWinner("paper", "paper")
            );
        }

        @Test
        void testScissorsScissorsTie() {
            RockPaperScissors game = new RockPaperScissors();

            assertEquals(
                    "tie",
                    game.determineWinner("scissors", "scissors")
            );
        }

        @Test
        void testPaperLosesToScissors() {
            RockPaperScissors game = new RockPaperScissors();

            assertEquals(
                    "computer",
                    game.determineWinner("paper", "scissors")
            );
        }

        @Test
        void testScissorsLosesToRock() {
            RockPaperScissors game = new RockPaperScissors();

            assertEquals(
                    "computer",
                    game.determineWinner("scissors", "rock")
            );
        }
        
        @Test
        void testComputerChoiceIsValid() {

            RockPaperScissors game = new RockPaperScissors();

            for(int i = 0; i < 100; i++) {

                String choice = game.getComputerChoice();

                assertTrue(
                    choice.equals("rock")
                    || choice.equals("paper")
                    || choice.equals("scissors")
                );
            }
        }
    }
