import java.util.List;

public class Manager extends User {

    public Manager(String username, String password) {
        super(username, password);
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

    // Add more manager-specific methods here
}
