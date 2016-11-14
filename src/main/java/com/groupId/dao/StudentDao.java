package com.groupId.dao;

import com.groupId.entity.Student;

import java.util.Collection;

/**
 * Created by utkarshbodake on 10/11/16.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void deleteStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}
