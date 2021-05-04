package com.omerkagandanaci.projecttrial3.Model;

import java.util.ArrayList;
/**
 * Passenger Class
 * @author Kerem Karzaoğlu
 * @version 01.05.2021
 */
public class Passenger {
    //Variables
    private String name;
    private String surname;
    private String birthDate;
    private String passportOrTCNo;
    private boolean isTcCitizen;
    private boolean expandable;

    //Constructor
    public Passenger(String name, String surname, String birthDate, String passportOrTCNo, boolean isTcCitizen) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.passportOrTCNo = passportOrTCNo;
        this.isTcCitizen = isTcCitizen;
    }

    //Methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassportOrTCNo() {
        return passportOrTCNo;
    }

    public void setPassportOrTCNo(String passportOrTCNo) {
        this.passportOrTCNo = passportOrTCNo;
    }

    public boolean isTcCitizen() {
        return isTcCitizen;
    }

    public void setIsTCCitizen(boolean tcCitizen) {
        isTcCitizen = tcCitizen;
    }

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }
}
