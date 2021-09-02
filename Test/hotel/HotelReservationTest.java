package hotel;

import java.time.LocalDate;
import java.time.Month;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotelReservationTest {
    /**
     * Created a parameterized constructor of hotelReservation.
     */

    HotelReservation hotelReservation = new HotelReservation();
    Hotel lakewood = new Hotel("LakeWood", 110);
    Hotel bridgewood = new Hotel("BridgeWood", 150);
    Hotel ridgewood = new Hotel("RidgeWood", 220);

    @Before
    public void setUp() {
        HotelReservation hotelReservation = new HotelReservation();
        hotelReservation.addHotel(lakewood);
        hotelReservation.addHotel(bridgewood);
        hotelReservation.addHotel(ridgewood);
    }


    @Test
    public void givenHotel_ToAddInHotelReservation_ShouldReturnTrue() {
        Assert.assertTrue(HotelReservation.hotels.contains(lakewood));
        Assert.assertTrue(HotelReservation.hotels.contains(bridgewood));
        Assert.assertTrue(HotelReservation.hotels.contains(ridgewood));
        HotelReservation.hotels.forEach(System.out::println);
    }

    /**
     * This method is used to check the cheapest hotel between the given data range
     * .
     */
    @Test
    public void givenDateRange_ShouldReturnCheapestHotel() {
        LocalDate startDate = LocalDate.of(2020, Month.SEPTEMBER, 10);
        LocalDate lastDate = LocalDate.of(2020, Month.SEPTEMBER, 11);
        Hotel cheapestHotel = hotelReservation.getCheapestHotel(startDate, lastDate);
        Assert.assertEquals("LakeWood", cheapestHotel.name);
    }

}