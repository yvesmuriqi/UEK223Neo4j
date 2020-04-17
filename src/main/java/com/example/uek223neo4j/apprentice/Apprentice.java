package com.example.uek223neo4j.apprentice;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;


@NodeEntity
public class Apprentice {

    @Id
    @GeneratedValue
    private int id;

    private String firstName;

    private String lastName;

    private int age;


    public Apprentice(int id, String firstName, String lastName,  int age ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName=lastName;
        this.age = age;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
