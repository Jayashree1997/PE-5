package com.stackroute.pe5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class StudentDetails {
    //    Store list of students
    private List<Student> studentList;

    public StudentDetails() {
        studentList = new ArrayList<>();
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addStudent(Student student) {
        getStudentList().add(student);
    }

    public List<Student> getSortedStudentsList() {
        Collections.sort(getStudentList(), new StudentSorter());
        return getStudentList();
    }
}
class Student{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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
}

/**
 * StudentSorter implements Comparator<Student> to compare to student objects
 * Comparision is done with age and if ages are same then their names are compared.
 * If names are same then their ID's are compared.
 */
class StudentSorter implements Comparator<Student>{

    @Override
    public int compare(Student student1, Student student2) {
        int ageCompareValue = student1.getAge() - student2.getAge();
        if (ageCompareValue == 0) {
            int nameCompareValue = student1.getName().compareTo(student2.getName());
            if (nameCompareValue == 0) {
                return student1.getId() - student2.getId();
            }
            return nameCompareValue;
        }
        return ageCompareValue;

    }
}


