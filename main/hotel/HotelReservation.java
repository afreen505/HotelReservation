package hotel;

import java.util.ArrayList;

public class HotelReservation {
    ArrayList<Hotel> hotelList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Hotel");
    }

    public void addHotelDetails() {
        hotelList.add(new Hotel("Lakewood", 110));
        hotelList.add(new Hotel("Bridgewood", 150));
        hotelList.add(new Hotel("Ridgewood", 250));

    }


}


