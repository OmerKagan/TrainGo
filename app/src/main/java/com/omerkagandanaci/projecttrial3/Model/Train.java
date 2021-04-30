package com.omerkagandanaci.projecttrial3.Model;

import java.util.ArrayList;

/**
 * Train Class
 * @author Mustafa Yetgin
 * @version 18.04.2021
*/ 
public class Train
{
    private static int lastTrainNumber = 0;    
    private boolean activeness;     
    private int trainNumber;    
    private String location;    
    private ArrayList<Integer> coordinates;
    
    public Train( String location, ArrayList<Integer> coordinates){        
        activeness = false;        
        this.trainNumber = lastTrainNumber + 1;
        this.location = location;        
        this.coordinates = coordinates;          
        lastTrainNumber++;
    }
    
    public boolean isActive(){
        
        return this.activeness;
    }
    
    public void setState(boolean b){
        
        activeness = b;
    }
    
    public int getTrainNumber(){
        
        return trainNumber;        
    }
    
    public void setTrainNumber(int i){
        
        trainNumber = i;        
    }
    
    public String getLocation(){        
        
        return location;
    }
    
    public void setlocation(String s){
        
        location = s;        
    }
    
    public ArrayList<Integer> getCoordinates(){
        
        return coordinates;        
    }
    
    public void setCoordinates(ArrayList<Integer> array ){
        
        coordinates = array;        
    }    
}