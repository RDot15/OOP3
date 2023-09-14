package cow_and_bulls;

import java.util.List;
import java.util.Random;

public abstract  class AbstractGame implements Game {

    Integer sizeWord;
    Integer maxTry;
    String word;
    GameStatus gameStatus = GameStatus.INIT;



    public String generateWord(){
        List<String> alphabet = generateCharList();
        String result="";
        Random random = new Random();
        for (int i=0;i<sizeWord;i++){
            int index = random.nextInt(alphabet.size());
            result = result.concat(alphabet.get(index));
        }


        return  result;
    }

    abstract List<String> generateCharList();


    @Override
    public void start(Integer sizeWord, Integer maxTry) {
this.sizeWord = sizeWord;
this.maxTry = maxTry;
this.word = generateWord();
gameStatus = GameStatus.START;
        System.out.println("Подсказка  " + word);
String help;
    }

    @Override
    public Answer inputValue(String value) {
maxTry--;
        int bulls = 0;
        int cows = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == value.charAt(i)) {
                bulls++;
                cows++;


            } else {

                for (int j = 0; j < word.length(); j++){
                    if (word.charAt(i)==value.charAt(j))
                        cows++;
                }

            }

        }
        if (word.length()==bulls){
            gameStatus=GameStatus.VICTORY;
        }
if (maxTry==0 && !gameStatus.equals(getGameStatus())){
    gameStatus=GameStatus.LOSE;
}


        return new Answer(value, bulls, cows) ;
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;

    }
}
