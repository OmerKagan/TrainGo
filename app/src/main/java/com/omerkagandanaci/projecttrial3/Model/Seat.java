package com.omerkagandanaci.projecttrial3.Model;
/**
 * Seat Class
 * @author Ömer Kağan Danacı
 * @version 28.04.2021
 */
public class Seat {

    private String seatNo;
    private boolean isEmpty;

    public Seat(String seatNo, boolean isEmpty) {
        this.seatNo = seatNo;
        this.isEmpty = isEmpty;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
