package Main;


import Practice3.Book;
import Practice3.House;

import java.util.*;

public class Main {
    private static Object ArrayList;

    public static void main(String[] args) {
//        Book potter1 = new Book(1001, "Гарри Поттер и философский камень", "Джоан Роулинг", "Bloomsbury Publishing", 1997, 332, 8.54);
//        Book potter2 = new Book(2002, "Гарри Поттер и Тайная комната", "Джоан Роулинг", "Bloomsbury Publishing", 1998, 251, 10.00);
//        Book potter3 = new Book(3003, "Гарри Поттер и узник Азкабана", "Джоан Роулинг", "Bloomsbury Publishing", 1999, 462, 22.99);
//        Book potter4 = new Book(4004, "Гарри Поттер и Кубок огня", "Джоан Роулинг", "Bloomsbury Publishing", 2000, 636, 6.92);
//        Book potter5 = new Book(5005, "Гарри Поттер и Орден Феникса", "Джоан Роулинг", "Bloomsbury Publishing", 2003, 607, 6.16);
//
//        ArrayList<Book> books = new ArrayList<>();
//        books.add(potter1);
//        books.add(potter2);
//        books.add(potter3);
//        books.add(potter4);
//        books.add(potter5);
//        System.out.println(books);

        House house1 = new House(2323, 326, 53, 4, 2, "Тисовая", "Лондон", 2051, 8, 25);
        House house2 = new House(4546, 123, 25, 15, 1, "Эрскин", "Торонто", 2042, 3, 24);
        House house3 = new House(8475, 387, 80, 21, 3, "Пасифика", "Найт-сити", 2077, 12, 17);
        House house4 = new House(1245, 52, 40, 8, 2, "Цезаря Бильзена", "Новиград", 1510, 7, 15);
        House house5 = new House(1985, 1123, 35, 5, 1, "Пушкинская", "Харьков", 2021, 1, 10);
        ArrayList<House> houses = new ArrayList<>();
        houses.add(house1);
        houses.add(house2);
        houses.add(house3);
        houses.add(house4);
        houses.add(house5);

        TreeSet<House> houses1 = new TreeSet<House>();
        houses1.add(house1);
        houses1.add(house2);
        houses1.add(house3);
        houses1.add(house4);
        houses1.add(house5);
        for (House h : houses1) {
            System.out.println(h);
        }
    }

}

