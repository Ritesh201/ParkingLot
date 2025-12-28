package org.example.service;

import org.example.models.User;
import org.example.models.Vehicle;

public class UserService {
     public void addVehicle(User user, Vehicle vehicle){
         user.setVehicle(vehicle);
         vehicle.setOwner(user);
     }
}
