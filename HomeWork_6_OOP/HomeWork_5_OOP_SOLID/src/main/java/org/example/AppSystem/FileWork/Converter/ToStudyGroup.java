package org.example.AppSystem.FileWork.Converter;

import org.example.Model.Groups.StudyGroup;

/**
 * Интерфейс парсинга групп
 */

public interface ToStudyGroup {
    StudyGroup toStudyGroup(String line);
}