package org.example.service;

import org.example.models.BookingId;
import org.example.models.Vehicle;

import java.util.HashMap;

public class BookingManager {
    HashMap<Vehicle, BookingId>map;
    BookingManager(){
        map=new HashMap<>();
    }
    public void addBooking(BookingId bookingId){
        map.put(bookingId.getVehicle(),bookingId);
    }
    public BookingId getBooking(Vehicle vehicle){
        return map.get(vehicle);
    }
}
