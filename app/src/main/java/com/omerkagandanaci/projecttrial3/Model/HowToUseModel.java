package com.omerkagandanaci.projecttrial3.Model;
/**
 * HowToUse Class
 * @author Ömer Kağan Danacı
 * @version 03.05.2021
 */
public class HowToUseModel {
    //Variables
    private String title;
    private String content;
    private boolean expandable;

    //Constructor
    public HowToUseModel(String title, String content) {
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

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    @Override
    public String toString() {
        return "HowToUseModel{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
