package hotel;

public class Hotel {
    private String hotelName;
    private int weekDayRate;
    private int weekendRate;

<<<<<<< HEAD

    public Hotel(String hotelName, int weekDayRate, int weekendRate) {
=======
    //PArameterized Constructor
    public Hotel(String hotelName, int regularRate) {
>>>>>>> Uc1_AddHotel
        this.hotelName = hotelName;
        this.weekDayRate = weekDayRate;
        this.weekendRate = weekendRate;
    }
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public int getWeekDayRate() {
        return weekDayRate;
    }
    public void setWeekDayRate(int weekDayRate) {
        this.weekDayRate = weekDayRate;
    }
    public int getWeekendRate() {
        return weekendRate;
    }
    public void setWeekendRate(int weekendRate) {
        this.weekendRate = weekendRate;
    }
}