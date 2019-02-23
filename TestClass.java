package assignmentthree;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class TestClass {

    public static void main(String[] args) {

        String text = "John.Davidson/05051988/Belgrade Michael.Barton/01011968/Krakov Ivan.Perkinson/23051986/Moscow";

        String[] textArray = text.split("[. /]+");

        ArrayList personList = new ArrayList();

        String name;
        String surname;
        LocalDate date;
        String place;

        String[] textArray1;

        for (int i = 0; i < textArray.length; i += 4) {
            name = textArray[i];
            surname = textArray[i + 1];
            date = LocalDate.parse(textArray[i + 2], DateTimeFormatter.ofPattern("ddMMyyyy"));
            place = textArray[i + 3];

            Person person = new Person(name, surname, date, place);

            personList.add(person);
        }

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
            System.out.println(" ");
        }

    }

}
