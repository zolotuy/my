package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private int salary;
    @ManyToOne
    private Section section;
//    @ManyToOne
//    private LoadLevel loadLevel;

    public Coach(int id, String name, int age, int salary, Section section, LoadLevel loadLevel) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.section = section;
        //this.loadLevel = loadLevel;
    }

    public Coach() {

    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

//    public LoadLevel getLoadLevel() {
//        return loadLevel;
//    }
//
//    public void setLoadLevel(LoadLevel loadLevel) {
//        this.loadLevel = loadLevel;
//    }
}
