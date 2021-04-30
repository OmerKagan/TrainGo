package com.omerkagandanaci.projecttrial3.Model;
/**
 * Manager Class
 * @author Ömer Kağan Danacı
 * @version 18.04.2021
 */
public class Manager extends Account {

    //Variables
    private String managerID;

    //Constructor
    public Manager(String email, String password, String managerID) {
        super(email, password);
        this.managerID = managerID;
    }

    //Methods
    public void managerLogin() {

    }

}
