package com.omerkagandanaci.projecttrial3.Model;
/**
 * TravelUser Class
 * @author Ömer Kağan Danacı
 * @version 01.05.2021
 */
public class TravelUser {

    private String startTime;
    private String endTime;
    private int numOfEmptySeats;
    private boolean expandable;

    public TravelUser(String startTime, String endTime, int numOfEmptySeats) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.numOfEmptySeats = numOfEmptySeats;
        this.expandable = false;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public int getNumOfEmptySeats() {
        return numOfEmptySeats;
    }

    public void setNumOfEmptySeats(int numOfEmptySeats) {
        this.numOfEmptySeats = numOfEmptySeats;
    }

    public boolean isExpandable() {
        return expandable;
    }

    public void setExpandable(boolean expandable) {
        this.expandable = expandable;
    }

    @Override
    public String toString() {
        return "TravelUser{" +
                "startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", numOfEmptySeats=" + numOfEmptySeats +
                '}';
    }
}
