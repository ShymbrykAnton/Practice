package Practice3.ProductComparable3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Product implements Comparable {
    private final long id;
    private final String name;
    private final String manufacturer;
    private final long price;
    private final long days;
    private final int year;
    private final int month;
    private final int day;
    private final int quantity;

    public Product(long id, String name, String manufacturer, long price, long days, int year, int month, int day, Calendar bestBefore, int quantity) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.days = days;
        this.year = year;
        this.month = month;
        this.day = day;
//        this.bestBefore = bestBefore;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
