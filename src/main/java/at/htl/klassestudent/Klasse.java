package at.htl.klassestudent;


public class Klasse {
    private  String klassenbezeichnung;
    private  static Student[] students;

    public Klasse() {
    }

    public Klasse(String klassenbezeichnung) {
        this();
        this.klassenbezeichnung = klassenbezeichnung;
    }

    public void add(Student student){
        if(students == null){
            students = new Student[1];
        }else {
            Student[] help = students;
            students = new Student[help.length + 1];
            for (int i = 0; i < help.length; i++) {
                students[i] = help[i];
            }
        }
        students[students.length - 1] = student;

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
    public static void sortBasic(Student[] students){
        printArray(students);

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i; j < students.length; j++) {
                if (students[j].compareTo(students[i]) < 0) {
                    Student help = students[i];
                    students[i] = students[j];
                    students[j] = help;
                }
            }
        }
        
    }

    private static void swap(Student[] students, int i, int j) {
        Student help = students[i];
        students[i] = students[j];
        students[j] = help;
    }

    public String getKlassenbezeichnung() {
        return klassenbezeichnung;
    }

    public void setKlassenbezeichnung(String klassenbezeichnung) {
        this.klassenbezeichnung = klassenbezeichnung;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

}
