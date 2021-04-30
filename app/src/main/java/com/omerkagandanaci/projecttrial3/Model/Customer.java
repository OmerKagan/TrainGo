package com.omerkagandanaci.projecttrial3.Model;

import java.util.ArrayList;
/**
 * Customer Class
 * @author Kerem Karzaoğlu
 * @version 18.04.2021
 */
public class Customer extends Account{

    //Variables
    private ArrayList<String> information;
    private ArrayList<Passenger> passengers;
    //private ArrayList<Ticket> tickets;
    private int points;

    //Constructor
    public Customer(String email, String password, ArrayList<String> information, int points) {
        super(email, password);
        this.information = information;
        this.points = points;
    }
    public Customer(String email, String password) {
        super(email, password);
    }


    //Methods
    public void signUp() {}
    public void customerLogin() {}
    public void logout() {}
    public void addNewPassenger(Passenger passenger) {}
    public void deletePassenger(Passenger passenger) {}
    public void setName(String name) {}
    public void setSurname(String surname) {}
    public void setMobileNo(String mobileNo) {}
    public int getPoints() {
        return points;
    }
    public void savePassenger(Passenger passenger) {}

    @Override
    public boolean updatePassword() {
        return super.updatePassword();
    }
}
