package com.example.accessingdatamongodb.Model;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;


public class Lecturer {
    @Id
    private String id;

    private String name;

    private String className;

    private LocalDate date;

    public Lecturer() {
    }

    public Lecturer(String name, String className, LocalDate date) {
        this.name = name;
        this.className = className;
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", date=" + date +
                '}';
    }
}
