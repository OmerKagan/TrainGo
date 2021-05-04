package com.omerkagandanaci.projecttrial3.Model;

import java.util.Date;

/**
 * Travel Class 
 * @author Mustafa Yetgin
 * @version 18.04.2021
*/ 
public class Travel
{    
    private static int lastTravelNumber = 0;
    protected String startingPoint;
    protected String endingPoint;
    private Date startingDate;
    private Date endingDate;
    private Train trainUsed;    
    private int travelNumber;
    
    public Travel(String startingPoint, String endingPoint, Date startingDate, Date endingDate, Train trainUsed){
        
        this.startingPoint = startingPoint;        
        this.endingPoint = endingPoint;        
        this.startingDate = startingDate;        
        this.endingDate = endingDate;        
        this.trainUsed = trainUsed;        
        travelNumber = lastTravelNumber + 1;        
        lastTravelNumber++;
        
    }

    public Travel(String startingPoint, String endingPoint) {
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
    }

    public String getStartingPoint(){
        
        return startingPoint;
    }
    
    public void setStartingPoint(String s){
        
        startingPoint = s;
    }
    
    public String getEndingPoint(){
        
        return endingPoint;
    }
    
    public void setEndingPoint(String s){
        
        endingPoint = s;
    }
    
    public int getTravelNumber(){
        
        return travelNumber;
    }
    
    public void setTravelNumber(int i){
        
        travelNumber = i;
    }
    
    public Train getTrainUsed(){
        
        return trainUsed;
    }
    
    public void setTrainUsed(Train t){
        
        trainUsed = t;
    }
    
    public Date getStartingDate(){
        
        return startingDate;
    }
    
    public void setStartingDate(Date d){        
        
       startingDate = d;        
    }
    
    public Date getEndingDate(){
        
        return endingDate;
    }
    
    public void setEndingDate(Date d){        
        
        endingDate = d;        
    }    
}