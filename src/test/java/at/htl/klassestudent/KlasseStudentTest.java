package at.htl.klassestudent;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class KlasseStudentTest {


    @Test
    public void student_compareTwoStudents_succes(){
        Student student1 = new Student("Anton", "Amsel");
        Student student2 = new Student("Zoran", "Zuckerbauer");

        assertThat(student1.compareTo(student2), lessThan(0));
    }

    @Test
    public void student_compareTwoStudentsReverse_succes(){
        Student student1 = new Student("Anton", "Amsel");
        Student student2 = new Student("Zoran", "Zuckerbauer");

        assertThat(student2.compareTo(student1), greaterThan(0));
    }

    @Test
    public void student_compareTwoEqualStudents_succes(){
        Student student1 = new Student("Anton", "Amsel");
        Student student2 = new Student("Anton", "Amsel");

        assertThat(student1.compareTo(student2), is(0));
    }

    @Test
    public void klasse_insertFirstStudent_success() {
        Student magda = new Student("Magdalena", "Scholz");
        Klasse klasse = new Klasse("2ahitm");
        klasse.add(magda);

        assertThat(klasse.getStudents(), hasItemInArray(magda));
    }

    @Test
    public void klasse_insertSecondStudent_success() {
        Klasse klasse = new Klasse("2ahitm");
        Student magda = new Student("Magdalena", "Scholz");
        Student nina = new Student("Nina", "Weissengruber");

        klasse.add(magda);
        klasse.add(nina);

        assertThat(klasse.getStudents(),hasItemInArray(magda));
        assertThat(klasse.getStudents(), hasItemInArray(nina));
    }

    @Test
    public void klasse_insertThirdStudent_success() {
        Student magda = new Student("Magdalena", "Scholz");
        Student nina = new Student("Nina", "Weissengruber");
        Student meris = new Student("Meris", "Besic");
        Klasse klasse = new Klasse("2ahitm");
        klasse.add(magda);
        klasse.add(nina);
        klasse.add(meris);

        assertThat(klasse.getStudents(),hasItemInArray(magda));
        assertThat(klasse.getStudents(),hasItemInArray(nina));
        assertThat(klasse.getStudents(),hasItemInArray(meris));
    }

    @Test
    public void klasse_insertFourthStudent_success() {
        Student magda = new Student("Magdalena", "Scholz");
        Student nina = new Student("Nina", "Weissengruber");
        Student meris = new Student("Meris", "Besic");
        Student adrian = new Student("Adrian", "Moser");
        Klasse klasse = new Klasse("2ahitm");

        klasse.add(magda);
        klasse.add(nina);
        klasse.add(meris);
        klasse.add(adrian);

        assertThat(klasse.getStudents(),arrayWithSize(4));
        assertThat(klasse.getStudents(),hasItemInArray(magda));
        assertThat(klasse.getStudents(),hasItemInArray(nina));
        assertThat(klasse.getStudents(),hasItemInArray(meris));
        assertThat(klasse.getStudents(),hasItemInArray(adrian));
    }

    @Test
    public void klasse_sortInsertionWithDifferentLastNames_success(){
        Student[] students = {new Student("Dora", "Dinkel"), new Student("Anton", "Amsel"), new Student("Egon", "Ennstaler"), new Student("Gustav", "Gans"), new Student("Constantin", "Clever"), new Student("Fridolin", "Fiedel"), new Student("Berta", "Buchinger")};
        Student[] studentsGoal = students.clone();


        Arrays.sort(studentsGoal);
        students = Klasse.sortInsertion(students);

        assertThat(students, is(studentsGoal));
    }

    @Test
    public void klasse_sortInsertionWithEqualLastNames_succes(){
        Student[] students = {new Student("Berta", "Müller"), new Student("Fridolin", "Müller"), new Student("Anton", "Müller"), new Student("Gustav", "Müller"), new Student("Constantin", "Müller"), new Student("Egon", "Müller"), new Student("Dora", "Müller")};
        Student[] studentsGoal = students.clone();

        Arrays.sort(studentsGoal);
        students = Klasse.sortInsertion(students);


        assertThat(students, is(studentsGoal));
    }

    @Test
    public void klasse_sortBubbleWithDifferentLastNames_sucess(){
        Student[] students = {new Student("Dora", "Dinkel"), new Student("Anton", "Amsel"), new Student("Egon", "Ennstaler"), new Student("Gustav", "Gans"), new Student("Constantin", "Clever"), new Student("Fridolin", "Fiedel"), new Student("Berta", "Buchinger")};
        Student[] studentsGoal = students.clone();

        Arrays.sort(studentsGoal);
        Klasse.sortBubble(students);

        assertThat(students, is(studentsGoal));
    }

    @Test
    public void klasse_sortBubbleWithEqualLastNames_success(){
        Student[] students = {new Student("Berta", "Müller"), new Student("Fridolin", "Müller"), new Student("Anton", "Müller"), new Student("Gustav", "Müller"), new Student("Constantin", "Müller"), new Student("Egon", "Müller"), new Student("Dora", "Müller")};
        Student[] studentsGoal = students.clone();

        Arrays.sort(studentsGoal);
        Klasse.sortBubble(students);

        assertThat(students, is(studentsGoal));
    }

    @Test
    public void klasse_sortBasicWithDifferentLastNames_succes(){
        Student[] students = {new Student("Dora", "Dinkel"), new Student("Anton", "Amsel"), new Student("Egon", "Ennstaler"), new Student("Gustav", "Gans"), new Student("Constantin", "Clever"), new Student("Fridolin", "Fiedel"), new Student("Berta", "Buchinger")};
        Student[] studentsGoal = students.clone();

        Arrays.sort(studentsGoal);
        Klasse.sortBasic(students);

        assertThat(students, is(studentsGoal));
    }

    @Test
    public void klasse_sortBasicWithEqualLastNames_succes(){
        Student[] students = {new Student("Berta", "Müller"), new Student("Fridolin", "Müller"), new Student("Anton", "Müller"), new Student("Gustav", "Müller"), new Student("Constantin", "Müller"), new Student("Egon", "Müller"), new Student("Dora", "Müller")};
        Student[] studentsGoal = students.clone();

        Arrays.sort(studentsGoal);
        Klasse.sortBasic(students);

        assertThat(students, is(studentsGoal));
    }

}