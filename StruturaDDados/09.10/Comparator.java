
public interface Comparator<T> {
    int compare(T o1, T o2);


    boolean equals(Object obj);

    default Comparator<T> reversed() {
        return (T o1, T o2) -> compare(o2, o1);
    }

    static <T extends Comparable<? super T>> Comparator<T> naturalOrder() {
        return (T o1, T o2) -> o1.compareTo(o2);
    }

    static <T extends Comparable<? super T>> Comparator<T> reverseOrder() {
        return (T o1, T o2) -> o2.compareTo(o1);
    }
}