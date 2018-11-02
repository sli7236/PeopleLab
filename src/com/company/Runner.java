package com.company;

public class Runner {
    private static String[] firstNames = new String[]{"Bob","Tim","Tom","Sabrina"};
    private static String[] familyNames = new String[]{"Li","Smith","Johnson","Williams"};

    public static void main(String[] args) {
        int numStudents = 4;

        Teacher ourTeacher = new Teacher("Nathan","Folwell","AP Java","Mr");

        Student[] ourStudents = new Student[numStudents];
        for (int i = 0; i < numStudents; i ++) {
            ourStudents[i] = randomStudent();
        }

        Classroom ourClassroom = new Classroom(ourStudents, ourTeacher);

        System.out.println(ourClassroom.printClass());
        System.out.println("\nClass Average: " + ourClassroom.classAverage());
    }

    public static Student randomStudent() {
        String randomFirstName = firstNames[(int)(Math.random() * firstNames.length)];
        String randomFamilyName = familyNames[(int)(Math.random() * familyNames.length)];
        double randomGPA = Math.round((Math.random() * 3 + 1) * 100) / 100.0;

        return new Student(randomFirstName, randomFamilyName, randomGPA,12,"Software Engineering");
    }
}