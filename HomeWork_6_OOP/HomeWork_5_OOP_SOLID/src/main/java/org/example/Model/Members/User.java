package org.example.Model.Members;

import org.example.Model.Members.Fields.AdderDate;
import org.example.Model.Members.Fields.Birthday;

import java.time.LocalDate;

/**
 * Абстрактный класс пользователь, содержащий в себе дату рождения, ФИО и id.
 */
public abstract class User {
    Birthday dateBirth;
    String fio;
    int id;
    static int count = 0;

    public User(String dateBirth, String fio,) {
        this.dateBirth = new AdderDate(dateBirth).addDate();
        this.fio = fio;
        this.id = ++count;
    }

    public User(int id, String fio, String dateBirth) {
        this.dateBirth = new AdderDate(dateBirth).addDate();
        this.fio = fio;
        this.id = id;
    }


    @Override
    public String toString() {
        return "User{" +
                "dateBirth=" + dateBirth +
                ", fio='" + fio + '\'' +
                ", id=" + id +
                '}';
    }

    public String getFio() {
        return fio;
    }
}
