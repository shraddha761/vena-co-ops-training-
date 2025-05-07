package CollectionsFrameWork.Q13FlightBooking;

public class Main {
    public static void main(String[] args) {
        Booking booking = new Booking();

        booking.requestBooking("Shraddha");
        booking.requestBooking("Ruhi");
        booking.requestBooking("Ranjana");
        booking.requestBooking("Pratham");

        booking.processBookings();
        booking.printConfirmedBookings();
    }
}
