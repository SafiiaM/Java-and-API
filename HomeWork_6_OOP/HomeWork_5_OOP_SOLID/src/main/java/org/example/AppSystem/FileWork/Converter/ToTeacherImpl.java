package org.example.AppSystem.FileWork.Converter;

import org.example.Model.Members.Teacher;

/**
 * Интерфейс конвертации String в Teacher
 */
public interface ToTeacherImpl {
    Teacher toTeacher (String line);

}