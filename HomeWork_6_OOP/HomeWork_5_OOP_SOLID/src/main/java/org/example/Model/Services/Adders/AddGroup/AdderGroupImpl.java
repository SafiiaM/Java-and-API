package org.example.Model.Services.Adders.AddGroup;

import org.example.Model.Groups.Group;
import org.example.Model.Members.User;

import java.util.List;

/**
 * Интерфейс методов добавления групп
 * @param <U1> класс ведущий
 * @param <U2> класс список студентов
 * @param <U3> класс групп
 * + Добавлено наследование абстрактных типов
 */

public interface AdderGroupImpl<U1 extends  User, U2 extends  User, U3 extends  Group> {
    String name();
    U1 leader();
    List<U2> members(int groupName);

    U3 newGroup();
}
