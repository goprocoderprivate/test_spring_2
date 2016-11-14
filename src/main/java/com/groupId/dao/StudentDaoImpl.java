package com.groupId.dao;

import com.groupId.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by utkarshbodake on 10/11/16.
 */
@Repository
public class StudentDaoImpl implements StudentDao {

    private static Map <Integer, Student> students;
    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Utk", "Computer Science"));
                put(2, new Student(2, "Vivek", "IT"));
                put(3, new Student(3, "Tushar", "Finance"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents() {
        return students.values();
    }

    @Override
    public Student getStudentById(int id) {
        return students.get(id);
    }

    @Override
    public void deleteStudentById(int id) {
        students.remove(id);
    }

    @Override
    public void updateStudent(Student student) {
        Student studentFromDb = students.get(student.getId());
        studentFromDb.setName(student.getName());
        studentFromDb.setCourse(student.getCourse());
        students.put(student.getId(), studentFromDb);
    }

    @Override
    public void insertStudent(Student student) {
        students.put(student.getId(), student);
    }
}
