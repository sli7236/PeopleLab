package com.company;

public class Teacher extends Person {
    private String subject, surname;

    public Teacher(String firstName, String lastName, String subject, String surname)
    {
        super(firstName, lastName);
        this.subject = subject;
        this.surname = surname;
    }

    public String getSubject()
    {
        return subject;
    }
    public String getSurname() {
        return surname;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }


    public String toString()
    {
        return surname + ". " + getLastName();
    }
}