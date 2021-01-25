package day6;

public class Airplane {
    private String producer;
    private int year;
    private double length;
    private double weight;
    private int fuel;

    public void setProducer(String producer) {
        this.producer = producer;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
    public int getFuel() {
        return fuel;
    }
    Airplane(String producer, int year, double length, double weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        fuel = 0;
    }
    public void info() {
        System.out.println("Изготовитель - " + producer + ", год выпуска - " + year + ", длина - " + length + ", вес - " + weight + ", топлива - " + fuel);
    }

    public int fillUp(int addFuel) {
        this.fuel = addFuel;
        return this.fuel;
    }
}

