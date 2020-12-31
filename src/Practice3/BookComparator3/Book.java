package Practice3.BookComparator3;

import java.util.Objects;

public class Book {
    private final int id;
    private final String title;
    private final String authorS;
    private final String publisher;
    private final int yearOfPublication;
    private final int numberOfPages;
    private final double price;

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public Book(int id, String title, String authorS, String publisher,
                int yearOfPublication, int numberOfPages, double price) {
        this.id = id;
        this.title = title;
        this.authorS = authorS;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                title.equals(book.title) &&
                authorS.equals(book.authorS) &&
                publisher.equals(book.publisher) &&
                yearOfPublication == book.yearOfPublication &&
                numberOfPages == book.numberOfPages &&
                price == book.price;
    }
    @Override
    public int hashCode() {
        return Objects.hash( id, title, authorS, publisher,
                yearOfPublication, numberOfPages, price);
    }
    @Override
    public String toString() {
        return "Название книги: " + title + ". Автор(ы): " + authorS +
                ". Издатель: " + publisher + ".\nГод публикации: " + yearOfPublication + ". Колличество страниц: "
                + numberOfPages + ". Цена (американский доллар): " + price;
    }
}
