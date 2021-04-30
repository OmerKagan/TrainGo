package com.omerkagandanaci.projecttrial3.Model;

import java.util.Date;
import java.util.ArrayList;
/**
 * Travels Class
 * @author Ahmet Arda Ceylan
 * @version 18.04.2021
*/ 
public class Travels {
    
    //Proporties
    private ArrayList<Travel> travels;

    //Constructor
    public Travels(ArrayList<Travel> t){
		this.travels = t;
    }
    
    //Methods    
    public void addTravel(Travel t){
        travels.add(t);
    }
    
    public ArrayList<Travel> getPastTravels(){
        ArrayList<Travel> pastTravels;
        pastTravels = new ArrayList<Travel>();
        Date currentDate = new Date();
        
        for (int i = 0; i < travels.size(); i++) {
            if(travels.get(i).getStartingDate().compareTo(currentDate) < 0 )
                pastTravels.add(travels.get(i));
        }
        return pastTravels;
    }

    public ArrayList<Travel> getTravels() {
        return travels;
    }

    public void setTravels(ArrayList<Travel> travels) {
        this.travels = travels;
    }
    
}
