package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] touristLocation;

    public TouristTicket(String pnr, String from, String to, Flight flight, String departureDateTime, String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean canceled, String hotelAddress, String[] touristLocation) {
        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price, canceled);
        this.hotelAddress = hotelAddress;
        this.touristLocation = touristLocation;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocation() {
        return touristLocation;
    }

    public void setTouristLocations(String[] touristLocation) {
        this.touristLocation = touristLocation;
    }
    public void removeTouristLocations(String location) {
        if (this.touristLocation.length > 0) {
            List<String> list = new ArrayList<String>(Arrays.asList(this.touristLocation));
            list.remove(location);
            this.touristLocation = list.toArray(new String[0]);
        }
    }
    public void addTouristLocation(String location) {
        if(this.touristLocation.length<5){
            touristLocation[touristLocation.length+1]=location;
        }

    }
}
