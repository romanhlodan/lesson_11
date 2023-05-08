package ua.com.hrv;

public class Car {
    private int hp;
    private int year_of_manuf;
    Helm helm;
    Engine engine;


    public Car(int hp, int year_of_manuf, Helm helm, Engine engine) {
        this.hp = hp;
        this.year_of_manuf = year_of_manuf;
        this.helm = helm;
        this.engine = engine;
    }

    public Car(int hp, int year_of_manuf) {
        this.hp = hp;
        this.year_of_manuf = year_of_manuf;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getYear_of_manuf() {
        return year_of_manuf;
    }

    public void setYear_of_manuf(int year_of_manuf) {
        this.year_of_manuf = year_of_manuf;
    }

    @Override
    public String toString() {
        return "Car{" +
                "hp=" + hp +
                ", year_of_manuf=" + year_of_manuf +
                ", helm=" + helm +
                ", engine=" + engine +
                '}';
    }
}
