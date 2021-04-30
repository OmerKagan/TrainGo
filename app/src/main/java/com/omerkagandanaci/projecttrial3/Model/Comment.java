package com.omerkagandanaci.projecttrial3.Model;

import java.util.ArrayList;

/**
 * A class to form comments of a Ticket.
 * @author Furkan Gön
 * @version 18/04/2021
*/
public class Comment {
    
    // properties
    private String comment;
    private int like;
    private int dislike;
    private int answers;
    private ArrayList<Comment> answerList;

    // constructor
    public Comment(String comment){
        
        this.comment = comment;
        this.like = 0;
        this.dislike = 0;
        this.answers = 0;
        answerList = null;
    }

    /**
     * @return the comment
    /
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
    */
    public void editComment(String comment) {
        this.comment = comment;
    }

    /**
     * @return the like
    */
    public int getLike() {
        return like;
    }

    /**
     * Add one to the like count.
    */
    public void setLike() {
        this.like = like + 1;
    }

    /**
     * @return the dislike
    */
    public int getDislike() {
        return dislike;
    }

    /**
     * Add one to the dislike count
    */
    public void setDislike() {
        this.dislike = dislike + 1;
    }

    /**
     * @return the answers
    */
    public int getAnswers() {
        return answers;
    }

    /**
     * @param answers the answers to set
    */
    public void setAnswers() {
        this.answers = answers + 1;
    }

    /**
     * @return the answerList
    */
    public ArrayList<Comment> getAnswerList() {
        return answerList;
    }

    /**
     * Add a comment as an answer of the comment.
    */
    public void addAnswer(Comment aComment) {
        answerList.add(aComment);
    }
    
}
