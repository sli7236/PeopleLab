package com.company;

public class Student extends Person {
    private double GPA;
    private int grade;
    private String major;

    public Student(String firstName, String familyName, double GPA, int grade, String major) {
        super(firstName, familyName);
        this.GPA = GPA;
        this.grade = grade;
        this.major = major;
    }

    public double getGPA() {
        return GPA;
    }
    public int getGrade() {
        return grade;
    }
    public String getMajor() {
        return major;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return the student's "FamilyName, FirstName, GPA, Grade, Major".
     */

    public String toString() {
        return getLastName() + ", " + getFirstName() +
                " GPA - " + getGPA() +
                " Grade - " + getGrade() +
                " Major - " + getMajor();
    }
}