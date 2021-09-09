package com.company;

import java.util.Scanner;


public class Main {
    static Flight f1 = new Flight("A315", "Air India", 100, 100);
    static Flight f2 = new Flight("A800", "Kingfisher", 50, 13);
    static Flight f3 = new Flight("A315", "Jet Airways", 75, 20);
    public static void main(String[] args) {

        System.out.println("Welcome to Airline Booking");

        int choice;
        do {
            System.out.println("1. Flight Details \n2.Passenger Registration \n3.Book ticket \n4.Exit");
            System.out.println("Enter your choice by number");
            Scanner s = new Scanner(System.in);
            choice = s.nextInt();
            Passenger p1 = null;

            switch (choice) {
                case 1:
                    System.out.println("Flights Details..");
                    System.out.println(f1.getFlightDetails());
                    System.out.println(f2.getFlightDetails());
                    System.out.println(f3.getFlightDetails());
                    break;
                case 2:
                    System.out.println("Enter your Address.. Start by Entering street");
                    String street = s.nextLine();
                    System.out.println("Enter your city name");
                    String city = s.nextLine();
                    System.out.println("Enter your State name");
                    String state = s.nextLine();
                    Address address = new Address(street, city, state);
                    System.out.println("Enter your Contact Details..");
                    System.out.println("Enter your  name");
                    String name = s.nextLine();
                    System.out.println("Enter your  phone");
                    String phone = s.nextLine();
                    System.out.println("Enter your email");
                    String email = s.nextLine();
                    Contact contact = new Contact(name, phone, email);
                    p1 = new Passenger(address, contact);
                    System.out.println(p1.getAddress().getAddressDetails() + " " + p1.getContact().getContactDetails());
                    break;
                case 3:
                        System.out.println("1. Regular ticket or 2. Tourist ticket");
                        int response = s.nextInt();
                        switch (response) {
                            case 1:
                                if(f1.checkAvailability()) {
                                    RegularTicket regular = new RegularTicket("PNR123", "Chennai", "Delhi", f1, "21-JAN-202210:00",
                                            "22-JAN-202205:00", p1, "12", 1200.78f, false, "Water");
                                    System.out.println("Ticket booked Successfully");
                                    printTicketDetails(regular);
                                    f1.setBookedSeat(f1.getBookedSeat() +1);
                                    System.out.println("Special Service Availed");
                                }
                                else {
                                    System.out.println("No Seats avaiable, Try other flights");
                                }
                                break;
                            case 2:
                                if (f2.checkAvailability()) {
                                    TouristTicket tourist = new TouristTicket("PNR123", "Chennai", "Delhi", f2, "21-JAN-202210:00",
                                            "22-JAN-202205:00", p1, "12", 1200.78f, false, "123,tajhotel", new String[]{"ooty", "agra", "jaipur", "kolkatta"});

                                    System.out.println("Ticket booked Successfully");
                                    printTicketDetails(tourist);
                                    f2.setBookedSeat(f2.getBookedSeat() +1);
                                } else {
                                    System.out.println("No Seats avaiable, Try other flights");
                                }
                                break;
                        }

                    break;
                default:
                    break;
            }
        }while(choice!=6);

    }

    private static  void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }


}
