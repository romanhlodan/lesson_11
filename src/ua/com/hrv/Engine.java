package ua.com.hrv;

public class Engine {
    private int number_of_cylinders;

    public Engine(int number_of_cylinders) {
        this.number_of_cylinders = number_of_cylinders;
    }

    public int getNumber_of_cylinders() {
        return number_of_cylinders;
    }

    public void setNumber_of_cylinders(int number_of_cylinders) {
        this.number_of_cylinders = number_of_cylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "number_of_cylinders=" + number_of_cylinders +
                '}';
    }
}
