package hotel;

public class Hotel {
    public String name;
    public int regularWeekDayRate;

    public Hotel(String name, int regularWeekDayRate) {
        this.name = name;
        this.regularWeekDayRate = regularWeekDayRate;

    }

    @Override
    public String toString() {
        return "Hotel Name: " + name + " " + "\nRegularWeekDayRate: " + regularWeekDayRate;
    }
}