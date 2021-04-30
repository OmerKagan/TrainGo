package com.omerkagandanaci.projecttrial3.Model;
/**
 * Faq Class
 * @author Ömer Kağan Danacı
 * @version 18.04.2021
 */
public class Faq {
    //Variables
    private String question;
    private String answer;

    //Constructor
    public Faq(String question, String answer) {
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
}
