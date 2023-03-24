package org.example.Model.Services.Adders.AddMember;

import org.example.Model.Services.UserService;
import org.example.Model.Services.Adders.Validity.Validity;

/**
 * Абстрактный класс добавления пользователей
 * 1)Реализован принцип единственной ответственности:
 * Добавление пользователей вынесено в отдельный класс,
 * Класс пользователей только хранит информацию
 * *
 * 2)Реализован принцип открытости/закрытости:
 * Класс Зав.кафедры будет наследником Teacher,
 * Класс Ректор будет наследником Зав.кафедры
 */


public abstract class UserAdderMembers implements AdderMembers {
    UserService us;
    Validity validity;

    public UserAdderMembers(UserService userService) {
        this.us = userService;
        this.validity = new Validity();
    }

    @Override
    public String date() {
        us.showInfo("\nДата рождения (дд.мм.гггг) : ");
        String value = us.userEnter();
        if (!validity.dateCheck(value)){
            us.showInfo("Ошибка при вводе");
            return date();
        }
        return value;
    }

    @Override
    public String fio() {
        us.showInfo("\nФИО: ");
        return us.userEnter();
    }
}

