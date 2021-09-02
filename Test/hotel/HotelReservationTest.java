package hotel;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class HotelReservationTest {

    HotelReservation hotelReservation = null;

    @Before
    public void setup() {
        hotelReservation = new HotelReservation();
    }

    @Test
<<<<<<< HEAD
    public void givenHotelDetails_whenAddedForHotel_Should_returnEnteredName() {

        Hotel newHotel = hotelReservation.addHotel("Lakewood", 110, 90);
        assertEquals(newHotel.getHotelName(), "Lakewood");
    }

    @Test
    public void givenHotelDetails_whenAddedForHotel_Should_returnEnteredWeekDayRate() {

        Hotel newHotel = hotelReservation.addHotel("Lakewood", 110, 90);
        assertEquals(newHotel.getWeekDayRate(), 110);
    }

    @Test
    public void givenHotelDetails_whenAddedForHotel_Should_returnEnteredWeekendRate() {

        Hotel newHotel = hotelReservation.addHotel("Lakewood", 110, 90);
        assertEquals(newHotel.getWeekendRate(), 90);
=======
    public void shouldPrintWelcomeMessage() {
        //Creating Object
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotelDetails();
>>>>>>> Uc1_AddHotel
    }
}