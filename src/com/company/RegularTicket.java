package com.company;

public class RegularTicket extends Ticket {

private String specialService;
    public RegularTicket(String pnr, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean canceled, String specialService) {
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price, canceled);
        this.specialService=specialService;
    }

    public String getSpecialService() {
        return specialService;
    }

    public void setSpecialService(String specialService) {
        this.specialService = specialService;
    }
    public void updateSpecialServices(String  specialService) {
        this.specialService=specialService;
    }
}
