package com.hitms.lms;

public class Course {
    private String id;
    private String name;

    public Course(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    // Added helper method for Task 3
    public String getCourseInfo() {
        return id + " - " + name;
    }

    @Override
    public String toString() {
        return getCourseInfo();
    }
}
