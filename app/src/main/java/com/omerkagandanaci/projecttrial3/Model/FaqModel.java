package com.omerkagandanaci.projecttrial3.Model;
/**
 * Faq Class
 * @author Ömer Kağan Danacı
 * @version 03.05.2021
 */
public class FaqModel {
    //Variables
    private String question;
    private String answer;
    private boolean expandable;

    //Constructor
    public FaqModel(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    //Methods
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    @Override
    public String toString() {
        return "Faq{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
