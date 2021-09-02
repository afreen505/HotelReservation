package hotel;
import org.junit.BeforeClass;
import org.junit.Test;

public class HotelReservationTest {
    static HotelReservation hotelReservation;

    @BeforeClass
    public static void initialize() {
        hotelReservation = new HotelReservation();
    }

    @Test
    public void shouldPrintWelcomeMessage()
    {
        //Creating Objects
        HotelReservation hotelReservation=new HotelReservation();
        hotelReservation.printWelcomeMessage();
        hotelReservation.addHotelDetails();
    }
}
