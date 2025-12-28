package org.example.models;

public class ParkingSeat {
    private int parkingNumber;
    private Vehicle.VehicleType  vehicleType;
    private Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getParkingNumber() {
        return parkingNumber;
    }

    public Vehicle.VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(Vehicle.VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSeat(int parkingNumber, Vehicle.VehicleType vehicleType) {
        this.parkingNumber=parkingNumber;
        this.vehicleType = vehicleType;
    }


}
