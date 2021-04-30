package com.omerkagandanaci.projecttrial3.Model;
/**
 * HowToUse Class
 * @author Ömer Kağan Danacı
 * @version 18.04.2021
 */
public class HowToUse {
    //Variables
    private String title;
    private String content;

    //Constructor
    public HowToUse(String title, String content) {
        this.title = title;
        this.content = content;
    }

    //Methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
