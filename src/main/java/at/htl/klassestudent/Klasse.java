package at.htl.klassestudent;


public class Klasse {

    //Just an example
    static Student[] studentsForBubble = {new Student("Lea", "Müller"), new Student("Thomas", "Steiner"), new Student("Peter", "Hinterdorfer"), new Student("Maria", "Bäcker"), new Student("Robert", "Kratky"), new Student("Julia", "Bäcker")};
    static Student[] studentsForInsertion = studentsForBubble.clone();


    public static void main(String[] args) {
        int klassenbezeichnung;

        sortBubble(studentsForBubble);
        sortInsertion(studentsForInsertion);
    }

    private static void printArray(Student[] students) {
        for (Student student : students) {
            if(student != null){
                if (student != students[students.length - 1]) {
                    System.out.print(student + ", ");
                }
                else{
                    System.out.print(student);
                }
            }
        }
    }

    public static Student[] sortInsertion(Student[] students) {
        Student[] sortedStudents = new Student[students.length];

        System.out.print("\n\nInsertion sort:\n\n");
        int j = 0;

        for (int i = 0; i < students.length; i++) {

            j = i;
            while(j > 0 && sortedStudents[j - 1].compareTo(students[i]) > 0){
                sortedStudents[j] = sortedStudents[j - 1];
                j--;
            }
            sortedStudents[j] = students[i];
            printArray(sortedStudents);
            System.out.print("\n");
        }
        return sortedStudents;
    }

    public static void sortBubble(Student[] students) {
        boolean swapped = false;

        System.out.print("Array unsortiert: ");
        printArray(students);
        System.out.print("\n\nBubble sort:\n\n");

        do {
            printArray(students);
            System.out.print("\n");
            swapped = false;
            for (int i = 0; i < students.length - 1; i++) {
                if(students[i].compareTo(students[i + 1]) > 0){
                    swap(students, i, i + 1);
                    swapped = true;
                }
            }
        } while (swapped);

    }

    private static void swap(Student[] students, int i, int j) {
        Student help = students[i];
        students[i] = students[j];
        students[j] = help;
    }

}
