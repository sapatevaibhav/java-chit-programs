//~ Implement a generic program using any collection class to count the number of elements in a collection that have a specific property such as even numbers, odd number, prime number and palindromes

import java.util.*;

class ElementCounter {
    public static <T> int countElementsWithProperty(Collection<T> collection,
            ElementPropertyChecker<T> propertyChecker) {
        int count = 0;
        for (T element : collection) {
            if (propertyChecker.hasProperty(element)) {
                count++;
            }
        }
        return count;
    }

    public interface ElementPropertyChecker<T> {
        boolean hasProperty(T element);
    }
}

public class chit7 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int evenCount = ElementCounter.countElementsWithProperty(integers,
                new ElementCounter.ElementPropertyChecker<Integer>() {

                    public boolean hasProperty(Integer element) {
                        return element % 2 == 0;
                    }
                });
        System.out.println("Number of even integers: " + evenCount);
    }
}
