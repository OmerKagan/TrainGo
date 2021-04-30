package com.omerkagandanaci.projecttrial3.Model;

import java.util.ArrayList;
/**
 * Railways Class
 * @author Ahmet Arda Ceylan
 * @version 18.04.2021
*/ 
public class Railways {
    
    //Proporties
    private ArrayList<Railway> railways; 
    
    //Constructors
    public Railways(ArrayList<Railway> r){
        this.railways = r;
    }
    
    //Methods
    public void addRail(Railway r){
        railways.add(r);
    }
    
    public ArrayList<Railway> getRail(){
        return railways;
    }
    
    private boolean connectedRails(Railway r1, Railway r2){
        if(r1.getStartingPoint() == r2.getStartingPoint()|| r1.getStartingPoint() == r2.getEndingPoint() 
        || r1.getEndingPoint() == r2.getStartingPoint() || r1.getEndingPoint() == r2.getEndingPoint())
            return true;
        else
            return false;    
    }
    
    
    public boolean checkExistance(String starting, String ending){
        boolean first = false ;
        boolean second = false;
        int f = 0;
        int s = 0;
        
        for (int i = 0; i < railways.size(); i++) {
            if(railways.get(i).getStartingPoint() == ending || railways.get(i).getEndingPoint() == ending)
                first = true;
                f = i;
            if(railways.get(i).getStartingPoint() == starting || railways.get(i).getEndingPoint() == starting)
                second = true;
                s = i;
        }
        if(second ==true && first == true && connectedRails(railways.get(f), railways.get(s)) == true)
            return true;
        else
            return false;     
    }
    
}
