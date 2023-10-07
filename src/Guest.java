import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Guest extends User {

    public Guest(String username, String password) {
        super(username, password);
    }

    public void viewReservations(Hotel hotel) {
        List<Reservation> reservations = hotel.getReservationsForGuest(this);
        displayReservations(reservations);
    }

    public void bookRoom(Hotel hotel, int roomNumber, Date checkIn, Date checkOut) {
        try {
            hotel.bookRoom(roomNumber, checkIn, checkOut, this);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void displayReservations(List<Reservation> reservations) {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
        } else {
            for (Reservation reservation : reservations) {
                System.out.println(reservation);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return Objects.equals(username, guest.username) &&
                Objects.equals(password, guest.password);
    }
    // Add more guest-specific methods here
}
