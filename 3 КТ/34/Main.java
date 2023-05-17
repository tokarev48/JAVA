import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static class Person {
        int weight;
        int sumOfDigits;

        public Person(int w) {
            weight = w;
            sumOfDigits = 0;
            while(w > 0) {
                sumOfDigits += w % 10;
                w /= 10;
            }
        }

        @Override
        public String toString() {
            return weight + " (" + sumOfDigits + ")";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        String[] weightsStr = line.split(" ");
        ArrayList<Person> people = new ArrayList<Person>();
        for(String w : weightsStr) {
            people.add(new Person(Integer.parseInt(w)));
        }
        Collections.sort(people, Comparator.comparingInt((Person p) -> p.sumOfDigits).reversed().thenComparingInt(p -> p.weight));
        for(Person person : people) {
            System.out.print(person.weight + " ");
        }
    }
}