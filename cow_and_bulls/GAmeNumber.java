package cow_and_bulls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GAmeNumber extends AbstractGame{


    @Override
    List<String> generateCharList() {
        List<String> list = new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9" ));


        return list ;
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
