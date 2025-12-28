package org.example;

import org.example.models.User;
import org.example.models.Vehicle;
import org.example.service.ParkingManager;
import org.example.service.UserService;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello, World!");
        ParkingManager parkingManager=new ParkingManager(3,2,2);
        User user=new User("Ram");
        Vehicle vehicle=new Vehicle("HR12B4567",Vehicle.VehicleType.TwoWheeler);
        UserService userService=new UserService();
        userService.addVehicle(user,vehicle);
        parkingManager.park(vehicle);
        Thread.sleep(2);
        parkingManager.unPark(vehicle);

    }
}