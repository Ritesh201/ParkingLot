package org.example.models;

import java.util.ArrayList;

public class ParkingFloor {
    private int floor;
    private ArrayList<ParkingSeat> twoWheelers;
    private ArrayList<ParkingSeat> fourWheelers;

    public ParkingFloor(int floor,int numberOfTwoWheelers,int numberOfFourWheelers) {
        this.floor = floor;
        twoWheelers=new ArrayList<>();
        for(int j=0;j<numberOfTwoWheelers;j++){
            twoWheelers.add(new ParkingSeat(j,Vehicle.VehicleType.TwoWheeler));
        }
        fourWheelers= new ArrayList<>();
        for(int j=0;j<numberOfFourWheelers;j++){
            fourWheelers.add(new ParkingSeat(j,Vehicle.VehicleType.FourWheeler));
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public ArrayList<ParkingSeat> getTwoWheelers() {
        return twoWheelers;
    }

    public void setTwoWheelers(ArrayList<ParkingSeat> twoWheelers) {
        this.twoWheelers = twoWheelers;
    }

    public ArrayList<ParkingSeat> getFourWheelers() {
        return fourWheelers;
    }

    public void setFourWheelers(ArrayList<ParkingSeat> fourWheelers) {
        this.fourWheelers = fourWheelers;
    }
}
