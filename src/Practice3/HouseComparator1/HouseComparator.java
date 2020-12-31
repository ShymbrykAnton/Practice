package Practice3.HouseComparator1;

import java.util.Comparator;

public class HouseComparator implements Comparator <House> {
    @Override
    public int compare(House o1, House o2) {
        return o1.getArea() - o2.getArea();
    }
}
