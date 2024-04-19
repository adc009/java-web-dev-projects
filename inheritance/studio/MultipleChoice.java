package studio;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class MultipleChoice extends Question{

    private ArrayList<String> answerKey;
    private HashMap<String,Boolean> selectedAnswers;
    public MultipleChoice(String inputPrompt){
        super(inputPrompt);
    }

    public boolean setCorrect() {
        super.setCorrect(true);
        return true;
    }

    public boolean setIncorrect() {
        super.setCorrect(false);
        return false;
    }




}
