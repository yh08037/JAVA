import java.util.Scanner;

class DiceGame {
    private int diceFace;
    private int userGuess;

    private void rollDice() {
        diceFace = (int) (Math.random() * 6) + 1;
    }

    private int getUserInput(String prompt) {
        System.out.print(prompt);
        Scanner s = new Scanner(System.in);
        return s.nextInt();
    }

    private void checkUserGuess() {
        if (diceFace == userGuess) {
            System.out.println("맞았습니다!");
        } else {
            System.out.println("틀렸습니다!");
        }
    }

    void startPlaying() {
        userGuess = getUserInput("예상값 입력 : ");
        rollDice();
        checkUserGuess();
    }

}


public class DiceGameTest {
    public static void main(String[] args) {
        DiceGame game = new DiceGame();
        game.startPlaying();
    }
}
