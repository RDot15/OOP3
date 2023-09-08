package cow_and_bulls;

public class Answer {



    private String userInput;
    private Integer bull;
    private Integer cow;
    public static int countAnswer = 0;

    public Answer(String userInput, Integer bull, Integer cow) {
        this.userInput = userInput;
        this.bull = bull;
        this.cow = cow;
        countAnswer++;

    }

    public String getUserInput() {
        return userInput;
    }

    public Integer getBull() {
        return bull;
    }

    public Integer getCow() {
        return cow;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public void setBull(Integer bull) {
        this.bull = bull;
    }

    public void setCow(Integer cow) {
        this.cow = cow;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "userInput='" + userInput + '\'' +
                ", bull=" + bull +
                ", cow=" + cow +
                '}';
    }
}