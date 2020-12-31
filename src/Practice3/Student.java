package Practice3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Student {
    long id;
    private String firstName;
    private String lastName;
    private String middleName;
    private int yearOfBirth;
    private int monthOfBirth;
    private int dayOfBirth;
    Calendar birthDate = new GregorianCalendar(yearOfBirth,monthOfBirth,dayOfBirth);
    private String address;
    private long phoneNumber;
    private String faculty;
    private String course;
    private String group;

    public Student(long id, String firstName, String lastName, String middleName, int yearOfBirth, int monthOfBirth, int dayOfBirth, String address, long phoneNumber, String faculty, String course, String group) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }
}
