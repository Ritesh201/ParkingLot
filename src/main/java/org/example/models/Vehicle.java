package org.example.models;


public class Vehicle {
    public enum VehicleType {
        TwoWheeler,FourWheeler
    }
    private final VehicleType type;
    private final String vehicleId;
    private User owner;

    public Vehicle(String vehicleId, VehicleType type) {
        this.vehicleId = vehicleId;
        this.type = type;
    }

    public VehicleType getType() {
        return type;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
