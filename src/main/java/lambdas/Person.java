package lambdas;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;


public class Person {

    private String firstName;
    private String lastName;
    private LocalDate dob;
    private Gender gender;
    private int age;

    public Person(String firstName, String lastName, LocalDate dob, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.age = getAge();
    }

    public int getAge(){

        int elapsedYears = (int)ChronoUnit.YEARS.between(LocalDate.now(), this.dob);
        return elapsedYears;
    };

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int ageDifference(final Person other) {
        return age - other.age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", gender=" + gender +
                '}';
    }

    public static List<Person> getPersons() {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("John", "Jacobs", LocalDate.of(1975, 1, 20), Gender.MALE));
        list.add(new Person("Wally", "Inman", LocalDate.of(1965, 9, 12), Gender.MALE));
        list.add(new Person("Donna", "Jacobs", LocalDate.of(1970, 9, 12), Gender.FEMALE));
        return list;
    }

    enum Gender {
        MALE, FEMALE
    }
}

