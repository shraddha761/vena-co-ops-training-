package CollectionsFramework.Q13FlightBooking;

import java.util.*;

public class FlightBookingManager {
    private Queue<String> bookingQueue = new LinkedList<>();
    private Map<String, Integer> confirmedBookings = new HashMap<>();
    private int nextSeatNumber = 1;

    public void requestBooking(String passengerName) {
        if (!bookingQueue.contains(passengerName)) {
            bookingQueue.offer(passengerName);
            System.out.println("Booking requested for " + passengerName);
        } else {
            System.out.println("Duplicate booking request for " + passengerName);
        }
    }

    public void processBookings() {
        while (!bookingQueue.isEmpty()) {
            String passenger = bookingQueue.poll();
            confirmedBookings.put(passenger, nextSeatNumber++);
            System.out.println("Confirmed booking for " + passenger + " with seat number " + confirmedBookings.get(passenger));
        }
    }

    public void printConfirmedBookings() {
        System.out.println("\nConfirmed Bookings:");
        for (Map.Entry<String, Integer> entry : confirmedBookings.entrySet()) {
            System.out.println(entry.getKey() + " -> Seat " + entry.getValue());
        }
    }
}
