package studio;

public class Question {
    private String prompt;

    private String[] responses;
    private boolean correct = false;

    public Question(String qPrompt) {
        prompt = qPrompt;
    }

    public void setCorrect(boolean input) {
        correct = input;
    }

    public boolean getCorrect() {
        return correct;
    }

    public void setPrompt(String input) {
        prompt = input;
    }

    public String getPrompt() {
        return prompt;
    }


}
