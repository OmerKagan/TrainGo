package com.omerkagandanaci.projecttrial3.Model;

/**
 * Railway Class
 * @author Ahmet Arda Ceylan
 * @version 18.04.2021
*/ 
public class Railway {
  
  //Proporties
  private String startingPoint;
  private String endingPoint;
  private int[] startingCordinates = {0, 0};
  private int[] endingCordinates = {0, 0};  
  
  //Constructers
  public Railway(String startingPoint, String endingPoint ){
    this.startingPoint = startingPoint;
    this.endingPoint = endingPoint;
  }
    
  //Methods
  
  public String getStartingPoint(){
    return startingPoint;
  }
  
  public String getEndingPoint(){
    return endingPoint;
  }
  
  public void setStartingPoint(String s){
    startingPoint = s;
  }
  
  public void setEndingPoint(String s){
    endingPoint = s;
  }

  public int[] getStartingCordinates(){
    return startingCordinates;
  }
  
  public int[] getEndingCordinates(){
    return endingCordinates;
  }
  
  public void setStartingCordinates(int[] i){
    startingCordinates = i;      
  }
  
  public void setEndingCordinates(int[] i){
    endingCordinates = i;  
  }      
  
}    
    

  

