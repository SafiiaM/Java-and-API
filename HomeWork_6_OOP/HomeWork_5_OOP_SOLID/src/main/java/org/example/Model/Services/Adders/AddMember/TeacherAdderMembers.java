package org.example.Model.Services.Adders.AddMember;

import org.example.Model.Members.Teacher;
import org.example.Model.Services.UserService;

/**
 * Класс добавления преподавалетей
 * Реализован принцип подстановки Барбары Лисков
 * Реализован принцип инверсии зависимостей:
 * Имплементация интерфейса в класс верхнего уровня.
 */
public class TeacherAdderMembers extends UserAdderMembers implements TeachersAdderImpl {
    public TeacherAdderMembers(UserService userService) {
        super(userService);
    }

    @Override
    public Teacher addTeacher(){
        Teacher teacher = new Teacher(date(), fio());
        us.showInfo("\nОпыт: ");
        String enterExp = us.userEnter();
        int exp;
        if (enterExp.length() > 0) {
            exp = Integer.parseInt(enterExp);
            teacher.setExperience(exp);
        }
        us.showInfo("Преподаватель добавлен");
        return teacher;
    }
}

