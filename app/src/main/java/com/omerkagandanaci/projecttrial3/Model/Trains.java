package com.omerkagandanaci.projecttrial3.Model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Trains Class
 * @author Mustafa Yetgin
 * @version 18.04.2021
*/ 
public class Trains
{
    private ArrayList<Train> trains;    
    
    public ArrayList<Train> getTrains(){
        
        return trains;        
    }
    
    public void addTrain(Train train){
        
        trains.add(train);        
    }
    
    public void deleteTrain( int trainNumber){
        
        trains.remove(trainNumber-1); // by assuming trainNumber starts from 1
    }
    
    public ArrayList<Train> findAvailableTrains( Date starting, Date ending, Travels travels){
        
        ArrayList<Train> availableTrains = new ArrayList<>();        
        ArrayList<Train> assignedTrains = new ArrayList<>();
        
        for (Travel travel : travels.getTravels() ) {
            
            if(ending.compareTo(travel.getStartingDate())<0 || starting.compareTo(travel.getEndingDate())>0)
            
                availableTrains.add(travel.getTrainUsed());
                
            assignedTrains.add(travel.getTrainUsed());
        }
            
        
        for (Train train: trains){
            
            if(!assignedTrains.contains(train))                
                availableTrains.add(train);            
        }
            
        return availableTrains;   
    } 
}        
        
        
   
    
    
    
