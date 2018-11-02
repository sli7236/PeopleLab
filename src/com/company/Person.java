package com.company;

public abstract class Person {
    private String firstName, lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setFamilyName(String lastName) {
        this.lastName = lastName;
    }

    public boolean equals(Person p) {
        return (p.firstName.equals(firstName)) && (p.lastName.equals(lastName));
    }
}