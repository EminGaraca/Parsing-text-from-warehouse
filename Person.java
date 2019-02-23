package assignmentthree;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Person {
    
    String name;
    String surname;
    LocalDate dateOfBird;
    String placeOfBird;
    
    public Person(String name, String surname, LocalDate dateOfBird, String placeOfBird) {
        this.name = name;
        this.surname = surname;
        this.dateOfBird = dateOfBird;
        this.placeOfBird = placeOfBird;
    }
    DateTimeFormatter date = DateTimeFormatter.ofPattern("dd. MMM. yyyy");

    @Override
    public String toString() {
        return   name + " " + surname + " " + dateOfBird.format(date) + " " + placeOfBird ;
    }
    
}
