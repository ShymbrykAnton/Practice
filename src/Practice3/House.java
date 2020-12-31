package Practice3;

import java.util.Calendar;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Objects;

public class House implements Comparable<House> {
    public int getId() {
        return id;
    }

    private int id;
    private int apartmentNumber;
    private int area;
    private int floor;
    private int numberOfRooms;
    private String street;
    private String city;
    private int year;
    private int month;
    private int day;
    private String serviceLife;

    public House(int id, int apartmentNumber, int area, int floor, int numberOfRooms, String street, String city, int year, int month, int day) {
        this.id = id;
        this.apartmentNumber = apartmentNumber;
        this.area = area;
        this.floor = floor;
        this.numberOfRooms = numberOfRooms;
        this.street = street;
        this.city = city;
        this.year = year;
        this.month = month;
        this.day = day;
        this.serviceLife = year + "." + month + "." + day + ".";
    }

    @Override
    public String toString() {
        //Номер квартиры, Площадь, Этаж, Количество комнат, Улица, Город, Срок эксплуатации
        return String.format("Номер квартиры: " + apartmentNumber + ". Площадь, кв.м.: " + area +
                ". Этаж: " + floor + ". Кол-во комнат: " + numberOfRooms + ". Улица: "
                + street + ". Город: " + city + ". Срок эксплуатации: " + serviceLife);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, apartmentNumber, area, floor, numberOfRooms, street, city, year, month, day);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return id == house.id &&
                apartmentNumber == house.apartmentNumber &&
                area == house.area &&
                floor == house.floor &&
                numberOfRooms == house.numberOfRooms &&
                street.equals(house.street) &&
                city.equals(house.city) &&
                year == house.year &&
                month == house.month &&
                day == house.day;
    }

    public int compareTo(House anotherHouse)
    {
        if (this.area == anotherHouse.area) {
            return 0;
        } else if (this.area < anotherHouse.area) {
            return -1;
        } else {
            return 1;
        }
    }
}
