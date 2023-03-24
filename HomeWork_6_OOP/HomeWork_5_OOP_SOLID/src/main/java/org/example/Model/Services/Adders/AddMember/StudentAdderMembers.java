package org.example.Model.Services.Adders.AddMember;

import org.example.Model.Members.Student;
import org.example.Model.Services.UserService;

/**
 * Класс добавления студентов
 * Реализован принцип подстановки Барбары Лисков
 * Реализован принцип инверсии зависимостей:
 * Имплементация интерфейса в класс верхнего уровня.
 */
public class StudentAdderMembers extends UserAdderMembers implements StudentsAdderImpl{
    public StudentAdderMembers(UserService userService) {
        super(userService);
    }

    @Override
    public Student addStudent() {
        Student student = new Student(date(), fio());
        us.showInfo("\nГруппа: ");
        String enterGroup = us.userEnter();
        int groupId;
        if (enterGroup.length() > 0) {
            groupId = Integer.parseInt(enterGroup);
            student.setGroupId(groupId);
        }
        us.showInfo("Студент добавлен");
        return student;
    }
}

