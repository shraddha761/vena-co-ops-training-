package CollectionsFrameWork.Q13FlightBooking;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Booking {
    Queue<String> requestQueue = new LinkedList<>();
    Map<String, String> confirmBooking = new HashMap<>();
    int seatNumber = 1;

    void addRequest(String request) {
        requestQueue.add(request);
    }

    void processRequest() {
        while (!requestQueue.isEmpty()) {
            String request = requestQueue.poll();
            String seat = "Confirmed seat " + seatNumber++;

            confirmBooking.put(seat, request);
//            System.out.println("Confirmed" + request + ": " + seat);
        }
    }
        public void displayConfirmedBookings(){
            for(Map.Entry<String, String> entry : confirmBooking.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

