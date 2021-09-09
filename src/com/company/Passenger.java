package com.company;

public class Passenger {
    private int id;
    private Address address;
    private Contact contact;

    //Constructors Declaration

    public Passenger(Address address, Contact contact) {
        this.id = ++id;
        this.address = address;
        this.contact = contact;
    }
    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
         this.address = address;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

}
