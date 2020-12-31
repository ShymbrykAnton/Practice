package Practice3.HouseComparator1;

import java.util.Objects;

public class House  {

    private final int id;
    private final int apartmentNumber;
    private final int area;
    private final int floor;
    private final int numberOfRooms;
    private final String street;
    private final String city;
    private final int year;
    private final int month;
    private final int day;
    private final String serviceLife;

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
        return "Номер квартиры: " + apartmentNumber + ". Площадь, кв.м.: " + area +
                ". Этаж: " + floor + ". Кол-во комнат: " + numberOfRooms + ". Улица: "
                + street + ". Город: " + city + ". Срок эксплуатации: " + serviceLife;
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


    public int getArea() {
        return area;
    }
}

