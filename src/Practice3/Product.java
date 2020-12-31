package Practice3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Product {
    private long id;
    private String name;
    private String manufacturer;
    private long price;
    private long days;
    private int year;
    private int month;
    private int day;
    private Calendar bestBefore = new GregorianCalendar(year,month,day);
    private int quantity;

    public Product(long id, String name, String manufacturer, long price, long days, int year, int month, int day, Calendar bestBefore, int quantity) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.days = days;
        this.year = year;
        this.month = month;
        this.day = day;
        this.bestBefore = bestBefore;
        this.quantity = quantity;
    }
}
