package org.example.models;

public class BookingId {
    private Vehicle vehicle;
    private final long bookingTimestamp;
    private long payingTimestamp;
    private boolean isPaid;

    @Override
    public String toString() {
        return "BookingId{" +
                "vehicle=" + vehicle +
                ", bookingTimestamp=" + bookingTimestamp +
                ", payingTimestamp=" + payingTimestamp +
                ", isPaid=" + isPaid +
                ", floor=" + floor +
                ", parkingNumber=" + parkingNumber +
                '}';
    }

    private int floor;
    private int parkingNumber;

    public BookingId(Vehicle vehicle, int parkingNumber, int floor) {
        this.vehicle = vehicle;
        this.parkingNumber = parkingNumber;
        this.floor = floor;
        this.bookingTimestamp=System.currentTimeMillis();
    }

    public long getPayingTimestamp() {
        return payingTimestamp;
    }

    public void setPayingTimestamp(long payingTimestamp) {
        this.payingTimestamp = payingTimestamp;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public long getBookingTimestamp() {
        return bookingTimestamp;
    }


    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getParkingNumber() {
        return parkingNumber;
    }

    public void setParkingNumber(int parkingNumber) {
        this.parkingNumber = parkingNumber;
    }


}
