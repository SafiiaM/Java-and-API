package org.example.AppSystem.FileWork;

import org.example.Model.Groups.StudyGroup;
import org.example.Model.Members.Student;
import org.example.Model.Members.Teacher;

import java.util.List;

/**
 * Интерфейс загрузки DB
 */
public interface LoadImpl {
    List<Student> loadStudents();
    List<Teacher> loadTeachers();
    List<StudyGroup> loadStudyGroups();
}