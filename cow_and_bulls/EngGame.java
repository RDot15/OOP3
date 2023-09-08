package cow_and_bulls;

import java.util.ArrayList;
import java.util.List;

public class EngGame extends AbstractGame{




    @Override
    List<String> generateCharList() {
        List<String> list = new ArrayList<>();

        for  (int j = 'a'; j<='z'; j++){
            list.add(String.valueOf((char)j));

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
