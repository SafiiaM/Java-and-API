package org.example.Model.Members;

import org.example.Model.Groups.StudyGroup;

import java.time.LocalDate;
import java.util.List;

/**
 * В класс Преподаватель добавлен опыт и список групп студентов, в которых он преподавал
 * Реализован принцип подстановки Барбары Лисков
 */

public class Teacher extends User{
    int experience;
    List<Integer> groupsId;

    public Teacher(String dateBirth, String fio) {
        super(dateBirth.fio);
    }

    public Teacher(int id, String fio, String dateBirth, int experience) {
        super(id, fio, dateBirth;
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Teacher id" + id +
                "dateBirth='" + dateBirth + '\'' +
                ", fio='" + fio + '\'' +
                ", опыт='" + experience;
    }
}
