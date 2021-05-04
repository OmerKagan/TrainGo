package com.omerkagandanaci.projecttrial3.Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * A class to create Ticket objects belong to a customer.
 * @author Furkan Gön
 * @version 18/04/2021
*/
public class Ticket {
    
    // properties
    private String fromWhere;
    private String toWhere;
    private String departmentDate;
    private String arrivalDate;
    private String startTime;
    private String endTime;
    private int compartmentNo;
    private String seat;
    private Passenger owner;
    private double price;
    private String type;
    private ArrayList<Comment> comments;
    private boolean expandable;

    // constructors
    public Ticket(String fromWhere, String toWhere, String departmentDate,
                  String arrivalDate, String startTime, String endTime, int compartmentNo,
                  String seat, Passenger owner, double price) {
        this.fromWhere = fromWhere;
        this.toWhere = toWhere;
        this.departmentDate = departmentDate;
        this.arrivalDate = arrivalDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.compartmentNo = compartmentNo;
        this.seat = seat;
        this.owner = owner;
        this.price = price;
        this.type = "Future";
        this.comments = null;
    }

    public Ticket(String fromWhere, String toWhere, String departmentDate,
                  String startTime, String endTime, int compartmentNo,
                  String seat, Passenger owner, double price) {
        this.fromWhere = fromWhere;
        this.toWhere = toWhere;
        this.departmentDate = departmentDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.compartmentNo = compartmentNo;
        this.seat = seat;
        this.owner = owner;
        this.price = price;
        this.type = "Future";
        this.comments = null;
    }

    // default constructor
    public Ticket(){

    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     * Edit the type if it is old, future or current ticket.
     */
    public void editType() {
        
        Date currentDate;
        currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String stringDate = formatter.format(currentDate);

        if(getDepartmentDate().compareTo(stringDate) < 0 && getArrivalDate().compareTo(stringDate) < 0)
            this.type = "Old";
        else if(getDepartmentDate().compareTo(stringDate) < 0 && getArrivalDate().compareTo(stringDate) >= 0)
            this.type = "Current";
        else 
            this.type = "Future";
    }
    /**
     * @return the comments
     */
    public ArrayList<Comment> getComments() {
        return comments;
    }


    /**
     * Add a comment to the comment list.
     */
    public void addComment(Comment aComment) {
        comments.add(aComment);
    }

    

    /**
     * @return the fromWhere
     */
    public String getFromWhere() {
        return fromWhere;
    }

    /**
     * @param fromWhere the fromWhere to set
     */
    public void setFromWhere(String fromWhere) {
        this.fromWhere = fromWhere;
    }

    /**
     * @return the toWhere
     */
    public String getToWhere() {
        return toWhere;
    }

    /**
     * @param toWhere the toWhere to set
     */
    public void setToWhere(String toWhere) {
        this.toWhere = toWhere;
    }

    /**
     * @return the compartmentNo
     */
    public int getCompartmentNo() {
        return compartmentNo;
    }

    /**
     * @param compartmentNo the compartmentNo to set
     */
    public void setCompartmentNo(int compartmentNo) {
        this.compartmentNo = compartmentNo;
    }

    /**
     * @return the seat
     */
    public String getSeat() {
        return seat;
    }

    /**
     * @param seat the seat to set
     */
    public void setSeat(String seat) {
        this.seat = seat;
    }

    /**
     * @return the owner
     */
    public Passenger getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(Passenger owner) {
        this.owner = owner;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    /**
     * @return the departmentDate
     */
    public String getDepartmentDate() {
        return departmentDate;
    }
    public void setDepartmentDate(String departmentDate) {
        this.departmentDate = departmentDate;
    }
    /**
     * @return the arrivalDate
     */
    public String getArrivalDate() {
        return arrivalDate;
    }
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }
}
