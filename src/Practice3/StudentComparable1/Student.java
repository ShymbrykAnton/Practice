package Practice3.StudentComparable1;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private final int id;
    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final int yearOfBirth;
    private final int monthOfBirth;
    private final int dayOfBirth;
    private final String address;
    private final String date;
    private final int phoneNumber;
    private final String faculty;
    private final String course;
    private final String group;

    public Student(int id, String firstName, String lastName, String middleName, int yearOfBirth, int monthOfBirth, int dayOfBirth, String address, int phoneNumber, String faculty, String course, String group) {
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
        this.date = yearOfBirth + "." + monthOfBirth + "." + dayOfBirth;
    }

    @Override
    public String toString() {
        return "ИОФ: " + firstName + " " + middleName +
                " " + lastName + ". Дата рождения: " + date + ". Адрес: "
                + address + ". Номер телефона: " + phoneNumber + ". Факультет: " + faculty +
                ". Курс:" + course + ". Группа:" + group;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, middleName, yearOfBirth, monthOfBirth,
                dayOfBirth, address, phoneNumber, faculty, course, group);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                firstName.equals(student.firstName) &&
                lastName.equals(student.lastName) &&
                middleName.equals(student.middleName) &&
                faculty.equals(student.faculty) &&
                course.equals(student.course) &&
                group.equals(student.group) &&
                address.equals(student.address) &&
                yearOfBirth == student.yearOfBirth &&
                monthOfBirth == student.monthOfBirth &&
                dayOfBirth == student.dayOfBirth &&
                phoneNumber == student.phoneNumber;
    }


    @Override
    public int compareTo(Student o) {
        if (this.yearOfBirth == o.yearOfBirth) {
            return hashCode() - o.hashCode();
        }
        return this.yearOfBirth > o.yearOfBirth ? 1 : -1;
    }
}
