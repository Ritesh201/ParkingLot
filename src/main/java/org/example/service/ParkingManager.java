package org.example.service;

import org.example.models.BookingId;
import org.example.models.ParkingFloor;
import org.example.models.ParkingSeat;
import org.example.models.Vehicle;
import java.util.ArrayList;

public class ParkingManager {

    ArrayList<ParkingFloor> parkings;
    BookingManager bookingManager;
    public ParkingManager(int floor, int numberOfTwoWheelers, int numberOfFourWheelers) {
        this.bookingManager=new BookingManager();
        parkings=new ArrayList<>();
        for(int i=0;i<floor;i++){
            parkings.add(new ParkingFloor(i,numberOfTwoWheelers,numberOfFourWheelers));
        }
    }

    public void park(Vehicle vehicle) {
        for(ParkingFloor parkingFloor:parkings){
            ArrayList<ParkingSeat> seats=vehicle.getType().equals(Vehicle.VehicleType.FourWheeler)
                    ?parkingFloor.getFourWheelers():parkingFloor.getTwoWheelers();
            for(ParkingSeat parkingSeat:seats){
                if(parkingSeat.getVehicle()==null){
                    parkingSeat.setVehicle(vehicle);
                    BookingId bookingId=new BookingId(vehicle,parkingSeat.getParkingNumber(),parkingFloor.getFloor());
                    this.bookingManager.addBooking(bookingId);
                    return ;
                }
            }
        }
        System.out.println("Parking is full");
    }

    public void unPark(Vehicle vehicle) {
        for(ParkingFloor parkingFloor:parkings){
            ArrayList<ParkingSeat> seats=vehicle.getType().equals(Vehicle.VehicleType.FourWheeler)
                    ?parkingFloor.getFourWheelers():parkingFloor.getTwoWheelers();
            for(ParkingSeat parkingSeat:seats){
                if(parkingSeat.getVehicle()!=null && parkingSeat.getVehicle().getVehicleId().equals(vehicle.getVehicleId())){
                    BookingId bookingId=this.bookingManager.getBooking(vehicle);
                    bookingId.setPayingTimestamp(System.currentTimeMillis());
                    bookingId.setPaid(true);
                    System.out.println(bookingId.toString());
                    parkingSeat.setVehicle(null);
                    return ;
                }
            }
        }
        System.out.println("Vehicle not found");
    }




}
