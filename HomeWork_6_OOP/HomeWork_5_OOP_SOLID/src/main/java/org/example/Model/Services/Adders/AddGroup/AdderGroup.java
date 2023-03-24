package org.example.Model.Services.Adders.AddGroup;

import org.example.Model.Services.UserService;

/**
 * Класс управления добавлением групп
 * Используется принцип единственной ответственности:
 * Публичный класс StudyGroup отвечает только за хранение информации о группах,
 * Абстрактный класс AdderGroup отвечает за создание/добавление новых групп.
 */


public abstract class AdderGroup {
    UserService us;

    public AdderGroup(UserService userService) {
        this.us = userService;
    }

}
