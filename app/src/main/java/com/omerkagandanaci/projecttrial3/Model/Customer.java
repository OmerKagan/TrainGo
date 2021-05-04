package com.omerkagandanaci.projecttrial3.Model;

import java.util.ArrayList;
/**
 * Customer Class
 * @author Kerem Karzaoğlu
 * @version 01.05.2021
 */
public class Customer extends Account{

    //Variables
    private ArrayList<String> information;
    private ArrayList<Passenger> passengers;
    private ArrayList<Ticket> tickets;
    private int points;

    //Constructor
    public Customer(String email, String password, int points) {
        super(email, password);
        this.points = points;
        passengers = new ArrayList<Passenger>();
        tickets = new ArrayList<Ticket>();
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
    public void setName(String name) {
        information.set(0, name);
    }
    public void setSurname(String surname) {
        information.set(1, surname);
    }
    public void setPhoneNo(String phoneNo) {
        information.set(4, phoneNo);
    }
    public int getPoints() {
        return points;
    }
    public void savePassenger(Passenger passenger) {}
    public void setInformation(String nameOfCus, String surnameOfCus, String TCIdOfCus, String birthDateOfCus, String phoneNoOfCus) {
        information = new ArrayList<String>();
        information.add(nameOfCus);
        information.add(surnameOfCus);
        information.add(TCIdOfCus);
        information.add(birthDateOfCus);
        information.add(phoneNoOfCus);
    }
    public ArrayList<String> getInformation() {
        return information;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void addAPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    @Override
    public boolean updatePassword() {
        return super.updatePassword();
    }
}
