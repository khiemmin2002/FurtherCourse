package W3.Lecture;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTesting {


    public static void main(String[] args) {
        // Iterator
        // Create an ArrayList object called cars
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Create an iterator object
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());

        // Print the rest of the items
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);

        Iterator<Integer> it2 = numbers.iterator();
        while(it2.hasNext()) {
            Integer i = it2.next();
            if(i < 10) {
                it2.remove();
            }
        }
        System.out.println(numbers);


    }
}
