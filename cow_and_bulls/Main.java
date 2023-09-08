package cow_and_bulls;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*2
        Game game = new GAmeNumber();
        game.start(5, 3);
        Scanner scanner = new Scanner(System.in);

        while(!game.getGameStatus().equals(GameStatus.VICTORY)
        && (!game.getGameStatus().equals(GameStatus.LOSE))) {
            String string = scanner.nextLine();
            Answer answer = game.inputValue(string);
            System.out.println("answer = " + answer);

            //System.out.println("game.inputValue(string) = " + game.inputValue(string));
        }
        System.out.println(game.getGameStatus());
scanner.close();
*/

        GameRun gameRun = new GameRun();
        gameRun.gameStart();









    }
}
