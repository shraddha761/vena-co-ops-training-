package CollectionsFrameWork.Q13FlightBooking;

public class Main {
    public static void main(String[] args) {
        Booking booking = new Booking();

        booking.addRequest("Shraddha");
        booking.addRequest("Ruhi");
        booking.addRequest("Ranjana");
        booking.addRequest("Pratham");

        booking.processRequest();
        booking.displayConfirmedBookings();
    }
}
