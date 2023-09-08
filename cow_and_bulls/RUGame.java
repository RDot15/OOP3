package cow_and_bulls;

import java.util.ArrayList;
import java.util.List;


public class RUGame extends AbstractGame{
    @Override
    List<String> generateCharList() {
       List<String> list = new ArrayList<>();

        for  (int i = 'a'; i<='я'; i++){
            list.add(String.valueOf((char)i));

        }

            return list;
    }

    @Override
    public void addLog(String log) {

    }

    @Override
    public String getGameLog() {
        return null;
    }

    @Override
    public void setMaxTry(Integer maxTry) {

    }

    @Override
    public void addLogFirst(String log) {

    }

    @Override
    public void exit() {

    }
}
