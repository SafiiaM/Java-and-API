package org.example.AppSystem.FileWork.Converter;

import org.example.Model.Members.Student;

/**
 * Интерфейс парсинга студентов
 */

public interface ToStudentImpl {
    Student toStudent(String line);
}