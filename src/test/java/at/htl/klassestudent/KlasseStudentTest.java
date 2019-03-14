package at.htl.klassestudent;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class KlasseStudentTest {

    @BeforeAll
        static void setup(){

    }

    @Test
    public void sortInsertionWithDifferentLastNames(){
        Student[] students = {new Student("Dora", "Dinkel"), new Student("Anton", "Amsel"), new Student("Egon", "Ennstaler"), new Student("Gustav", "Gans"), new Student("Constantin", "Clever"), new Student("Fridolin", "Fiedel"), new Student("Berta", "Buchinger")};
        Student[] studentsGoal = students.clone();

        Arrays.sort(studentsGoal);
        students = Klasse.sortInsertion(students);

        assertThat(students, is(studentsGoal));
    }

    @Test
    public void sortInsertionWithEqualLastNames(){
        Student[] students = {new Student("Berta", "Müller"), new Student("Fridolin", "Müller"), new Student("Anton", "Müller"), new Student("Gustav", "Müller"), new Student("Constantin", "Müller"), new Student("Egon", "Müller"), new Student("Dora", "Müller")};
        Student[] studentsGoal = students.clone();

        Arrays.sort(studentsGoal);
        students = Klasse.sortInsertion(students);


        assertThat(students, is(studentsGoal));
    }

    @Test
    public void sortBubbleWithDifferentLastNames(){
        Student[] students = {new Student("Dora", "Dinkel"), new Student("Anton", "Amsel"), new Student("Egon", "Ennstaler"), new Student("Gustav", "Gans"), new Student("Constantin", "Clever"), new Student("Fridolin", "Fiedel"), new Student("Berta", "Buchinger")};
        Student[] studentsGoal = students.clone();

        Arrays.sort(studentsGoal);
        Klasse.sortBubble(students);

        assertThat(students, is(studentsGoal));
    }

    @Test
    public void sortBubbleWithEqualLastNames(){
        Student[] students = {new Student("Berta", "Müller"), new Student("Fridolin", "Müller"), new Student("Anton", "Müller"), new Student("Gustav", "Müller"), new Student("Constantin", "Müller"), new Student("Egon", "Müller"), new Student("Dora", "Müller")};
        Student[] studentsGoal = students.clone();

        Arrays.sort(studentsGoal);
        Klasse.sortBubble(students);

        assertThat(students, is(studentsGoal));
    }


}