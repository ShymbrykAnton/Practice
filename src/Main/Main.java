package Main;


import Practice3.BookComparator3.Book;
import Practice3.BookComparator3.BookComparator;
import Practice3.HouseComparator1.House;
import Practice3.HouseComparator1.HouseComparator;
import Practice3.StudentComparable1.Student;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        students.add(new Student(1001, "Гарри", "Поттер", "Джеймсон", 1997, 7, 8,"Лондон",451522463,"Гриффиндор","3","Geg1"));
        students.add(new Student(1001, "Геральт", "Ривии", "Из", 1501, 8, 20,"Варшава",454522463,"Школа Волка","4","Geg2"));
        students.add(new Student(1001, "Ви", "Из", "Найт-сити", 2055, 5, 19,"НСША",451522483,"Корпорат","1","Geg4"));
        students.add(new Student(1001, "Шрек", "Огр", "Огрович", 1450, 3, 12,"Болото",457822463,"БолотныйУнивер","2","Geg7"));
        students.add(new Student(1001, "Гринч", "Клаусс", "Сантович", 1000, 1, 17,"Лапландия",450222463,"Рождевственники","5","Geg5"));
        for (Student s : students) {
            System.out.println(s);
        }

        BookComparator bookComparator = new BookComparator();
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1001, "Гарри Поттер и философский камень", "Джоан Роулинг", "Bloomsbury Publishing", 1997, 332, 8.54));
        books.add(new Book(1001, "Гарри Поттер и Тайная комната", "Джоан Роулинг", "Bloomsbury Publishing", 1998, 480, 4.59));
        books.add(new Book(3003, "Гарри Поттер и узник Азкабана", "Джоан Роулинг", "Bloomsbury Publishing", 1999, 462, 22.99));
        books.add(new Book(4004, "Гарри Поттер и Кубок огня", "Джоан Роулинг", "Bloomsbury Publishing", 2000, 636, 6.92));
        books.add(new Book(5005, "Гарри Поттер и Орден Феникса", "Джоан Роулинг", "Bloomsbury Publishing", 2003, 607, 6.16));
        books.sort(bookComparator);
        for (Book b : books) {
            System.out.println(b);
        }

        HouseComparator houseComparator = new HouseComparator();
        List<House> houses = new ArrayList<>();
        houses.add(new House(2323, 326, 53, 4, 2, "Тисовая", "Лондон", 2051, 8, 25));
        houses.add(new House(4546, 123, 25, 15, 1, "Эрскин", "Торонто", 2042, 3, 24));
        houses.add(new House(8475, 387, 80, 21, 3, "Пасифика", "Найт-сити", 2077, 12, 17));
        houses.add(new House(1245, 52, 40, 8, 2, "Цезаря Бильзена", "Новиград", 1510, 7, 15));
        houses.add( new House(1985, 1123, 35, 5, 1, "Пушкинская", "Харьков", 2021, 1, 10));
        houses.sort(houseComparator);
        for (House h : houses) {
            System.out.println(h);
        }
    }

}

