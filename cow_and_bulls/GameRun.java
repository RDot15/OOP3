package cow_and_bulls;

import java.util.Scanner;
public class GameRun {
    public void gameStart() {
        Game game = choiseOfGames();
        chooseMainOption(game);
        do {
            chooseGameOptions(game);
        }
        while (!game.getGameStatus().equals(GameStatus.VICTORY)
                && !game.getGameStatus().equals(GameStatus.LOSE));
    }

    private void chooseGameOptions(Game game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие \n" +
                "1 - Ввести ответ\n" +
                "2 - Посмотреть правильный ответ \n" +
                "3 - Перезапуск игры \n" +
                /*"4 - Restart game with new word\n" +*/
                "4 - End game");
        int choise = scanner.nextInt();
        if (choise == 1) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введите слово :");
            String scannerWord = scanner1.nextLine();
            Answer answer = game.inputValue(scannerWord);
            System.out.println("bulls = " + answer.getBull() + " cows = " + answer.getCow());
            game.addLog(answer.toString());
        }
        if (choise == 2) {
            System.out.println(game.getGameLog());
            chooseGameOptions(game);
        }
        if (choise == 3) {
            System.out.println("Your's max Try count = 10");
            game.addLog("User take option restart");
            game.setMaxTry(10);
            chooseGameOptions(game);
        }
//        if (choise == 4) {
//            game.addLog("User restarted all program");
//            String buf = game.getGameLog();
//            game = choiseOfGames();
//            game.addLogFirst(buf);
//            chooseMainOption(game);
//            chooseGameOptions(game);
//        }
        if (choise == 4) {
            game.exit();
        }

    }

    public Game choiseOfGames() {
        System.out.println("Выберите игру:\n" +
                "1 - игра с цифрами.\n" +
                "2 - игра с русскими словами.\n" +
                "3 - игра с английскими словами.");
        Scanner scanner = new Scanner(System.in);
        int choise = scanner.nextInt();
        if (choise == 1) {
            Game game = new GAmeNumber();
            System.out.println(" Выбрана игра с цифрами ");
            game.addLog(" Выбрана игра с цифрами");
            return game;
        }
        if (choise == 2) {
            Game game = new RUGame();
            System.out.println(" Выбрана игра с руссими словами");
            game.addLog(" Выбрана игра с руссими словами");
            return game;
        }
        if (choise == 3) {
            Game game = new EngGame();
            System.out.println("Выбрана игра с английскими словами");
            game.addLog("Выбрана игра с английскими словами");
            return game;
        } else {
            System.out.println("Выбрано не верное значение");
            return choiseOfGames();
        }
    }

    public Game choiseOfGames(Game game) {
        return choiseOfGames();
    }

    public void chooseMainOption(Game game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нужное значение :\n" +
                "1 - Новая игра\n" +
                "2 - Посмотреть ответы\n" +
                "3 - Выбрать тип игры");
        int choise = scanner.nextInt();
        if (choise == 1) {
            System.out.println(" Введите длину слова ");
            int wordLength = scanner.nextInt();
            System.out.println(" Введите количество попыток ");
            int maxTry = scanner.nextInt();
            game.addLog("Длина строк= " + wordLength + " ,количество знанений = " + maxTry);
            game.start(wordLength, maxTry);
        }
        if (choise == 2) {
            System.out.println(game.getGameLog());
            chooseMainOption(game);
        }
        if (choise == 3) {
            game = choiseOfGames(game);
            chooseMainOption(game);
        }


    }
}