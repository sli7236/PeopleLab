package com.company;

public class Classroom {
    private Student[] students;
    private Teacher teacher;
    private Student[][] seatingChart = new Student[2][2];

    public Classroom(Student[] students, Teacher teacher) {
        this.students = students;
        this.teacher = teacher;
        fillSeats();
    }

    public Student[] getStudents() {
        return students;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    public double classAverage() {
        double sum = 0;

        for (Student cur : students)
            sum += cur.getGPA();

        return sum / students.length;
    }

    public String printClass() {
        String studentString = "";

        for (int i = 0; i < students.length; i++) {
            studentString += "\n" + (i + 1) + ". " + students[i].toString();
        }

        return "Teacher: " + teacher.toString() +
                "\nSubject: " + teacher.getSubject() +
                "\nStudents: " + studentString;
    }

    private void fillSeats() {
        int idx = 0;
        for (Student[] studentArr : seatingChart) {
            for (int i = 0; i < studentArr.length; i++) {
                studentArr[i] = students[idx];
                idx++;
            }
        }
    }
}