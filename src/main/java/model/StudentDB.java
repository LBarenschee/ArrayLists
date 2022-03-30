package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StudentDB {
    ArrayList<Student> students;

    public StudentDB(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getAllStudents(){
        return students;
    }

    public Student randomStudent(){
        int index = (int) ((double) students.size() * Math.random());
        return students.get(index);
    }

    public void addStudent(Student newStudent){
        students.add(newStudent);
    }

    public boolean remove(Student oldStudent){
        students.remove(oldStudent);
        return true;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }

}

