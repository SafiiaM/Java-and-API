package org.example.Model.Groups;

import org.example.Model.Members.Student;
import org.example.Model.Members.Teacher;
import org.example.Model.Members.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс создания групп студентов и преподавателей
 * Реализован принцип подстановки Барбары Лисков
 */

public class StudyGroup extends Group<Teacher, Student>{
    int groupId;

    /**
     * Создание группы
     * @param teacher преподаватель
     * @param students список студентов
     * @param groupId № группы
     */

    public StudyGroup(Teacher teacher, List<Student> students, int groupId) {
        super(teacher, students);
        this.groupId = groupId;
    }


    @Override
    public String toString() {
        return
                "№ группы" + groupId +
                ", ведущий " + leader.getFio() +
                ", количество " + members.size();
    }

    /**
     *
     * @return № группы
     */

    public int getGroupId() {
        return groupId;
    }
}
