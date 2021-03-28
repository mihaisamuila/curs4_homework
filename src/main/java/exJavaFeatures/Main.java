package exJavaFeatures;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studenti = new ArrayList<Student>();

        //studenti introdusi cu data nasterii
        Student ion = new Student("Ion", LocalDate.of(1980, 3, 20), 3);
        Student ghita = new Student("Gheorghe", LocalDate.of(1950, 2, 21), 1);

        //studenti introdusi cu varsta
        Student vasile = new Student("Vasile", 10, 30);
        Student dorel = new Student("Dorel", 1, 40);

        studenti.add(ion);
        studenti.add(ghita);
        studenti.add(vasile);
        studenti.add(dorel);

        System.out.println("Ion are: " + ion.getAge());
        System.out.println(ion);

        System.out.println("Dorel are: " + dorel.getAge());
        System.out.println(dorel);

    }

}
