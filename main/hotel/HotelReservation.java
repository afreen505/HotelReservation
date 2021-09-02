package hotel;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HotelReservation {
    /**
     * Created a array list name as hotels.
     */
    public static List<Hotel> hotels = new ArrayList<>();

    /**
     * Created a array list name as hotels. Created a method addHotel to add the
     * hotels in the array list.
     */
    public void addHotel(Hotel hotel) {
        hotels.add(hotel);
    }

    public Hotel getCheapestHotel(LocalDate startDate, LocalDate lastDate) {
        long daysBetween = ChronoUnit.DAYS.between(startDate, lastDate);
        int cheapRate;
        Hotel cheapest = Collections.min(hotels, Comparator.comparing(hotel -> hotel.regularWeekDayRate));
        cheapRate = (int) ((daysBetween + 1) * cheapest.regularWeekDayRate);
        System.out.println("Cheapest Hotel Name: " + cheapest.name + "\nTotal Rate: " + cheapRate);
        return cheapest;
    }
}