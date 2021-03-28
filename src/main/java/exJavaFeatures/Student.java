package exJavaFeatures;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;

public record Student(String name, LocalDate birthDate, int grade, int age) {

    private static final int randomDay = ThreadLocalRandom.current().nextInt(1, 29);
    private static final int randomMonth = ThreadLocalRandom.current().nextInt(1, 13);
    private static final LocalDate today = LocalDate.now();
    private static final int currentYear = Calendar.getInstance().get(Calendar.YEAR);

    public Student(String name, LocalDate birthDate, int grade) {
        this(name,
                birthDate,
                grade,
                Period.between(birthDate, today).getYears());
    }

    public Student(String name, int grade, int age) {
        this(name,
                LocalDate.of(currentYear - age, randomMonth, randomDay),
                grade,
                age);
    }

    public int getAge() {
        int years = Period.between(birthDate, today).getYears();
        return years;
    }

}
