package Practice3.BookComparator3;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        if (sortByYearOfPublication(o1.getYearOfPublication(), o2.getYearOfPublication()) != 0) {
            return sortByYearOfPublication(o1.getYearOfPublication(), o2.getYearOfPublication());
        }
        return sortByTittleLength(o1.getTitle(), o2.getTitle());
    }

    private int sortByTittleLength(String tittle1, String tittle2) {
        int length1 = tittle1.length();
        int length2 = tittle1.length();
        int minLength = Math.min(length1, length2);
        for (int i = 0; i < minLength; i++) {
            int result = tittle1.charAt(i) - tittle2.charAt(i);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }

    private int sortByYearOfPublication(int year1, int year2) {
        return year1 - year2;
    }
}
