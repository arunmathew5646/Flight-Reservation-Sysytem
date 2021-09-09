package com.company;

public class Flight {
    private String flightNumber;
    private String airLine;
    private int capacity;
    private int bookedSeat;
    private static int bookingCounter;

    static {
        bookingCounter = 0;
    }

    public Flight(String flightNumber, String airLine, int capacity, int bookedSeat) {
        ++bookingCounter;
        this.flightNumber = flightNumber;
        this.airLine = airLine;
        this.capacity = capacity;
        this.bookedSeat = bookedSeat;
    }
    public void incrementBookingCounter(){
        this.bookingCounter=bookingCounter;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirLine() {
        return airLine;
    }

    public void setAirLine(String airLine) {
        this.airLine = airLine;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeat() {
        return bookedSeat;
    }

    public void setBookedSeat(int bookedSeat) {
        this.bookedSeat = bookedSeat;
    }
    public String getFlightDetails(){
        return getFlightNumber() + " " +getAirLine() +" "+getBookedSeat() +" "+ getCapacity();
    }
    public boolean checkAvailability(){
        return capacity-bookedSeat >= 1;
    }


}
