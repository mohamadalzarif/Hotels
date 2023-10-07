import java.util.*;

public class Room {
    private int roomNumber;
    private String type;
    private boolean availableForCleaning;
    private boolean occupied;
    private double price;
    private List<Reservation> reservations = new ArrayList<>();

    private Staff cleaningStaff;

    public Staff getCleaningStaff() {
        return cleaningStaff;
    }

    public void assignCleaningStaff(Staff staff) {
        this.cleaningStaff = staff;
    }

    public Room(int roomNumber, String type, double price) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.occupied = false;
    }

    public boolean isAvailableForCleaning() {
        return availableForCleaning;
    }

    public void setAvailableForCleaning(boolean availableForCleaning) {
        this.availableForCleaning = availableForCleaning;
    }
    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable(Date checkIn, Date checkOut) {
        for (Reservation reservation : reservations) {
            if ((checkIn.before(reservation.getCheckOutDate()) || checkIn.equals(reservation.getCheckOutDate()))
                    && (checkOut.after(reservation.getCheckInDate()) || checkOut.equals(reservation.getCheckInDate()))) {
                return false; // overlapping dates found
            }
        }
        return true;
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    @Override
    public String toString() {
        return "Room Number: " + roomNumber +
                "\nType: " + type +
                "\nPrice: $" + price +
                "\n";
    }

    public void removeCurrentReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

}
