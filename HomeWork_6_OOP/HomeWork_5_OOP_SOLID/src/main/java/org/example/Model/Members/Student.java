package org.example.Model.Members;

import java.time.LocalDate;
import java.util.List;

/**
 * В публичный класс Студент добавлена инфа по ID (№) группы и оценках (grades)
 * Реализован принцип подстановки Барбары Лисков
 */

public class Student extends User{
    int groupId;
    List<Integer> grades;

    public Student(String dateBirth, String fio) {
        super(dateBirth, fio);
    }

    public Student(int id, String fio, String dateBirth, int groupId) {
        super(id, fio, dateBirth);
    }


    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public List<Integer> getGroups() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student id=" + id +
                "dateBirth='" + dateBirth + '\'' +
                ", fio='" + fio + '\'' +
                ", № группы" + groupId;
    }
}
