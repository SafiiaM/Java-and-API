package org.example.Model.Groups;

import org.example.Model.Members.Student;
import org.example.Model.Members.User;

import java.util.List;

/**
 * Абстрактный класс объединения пользователей
 * @param <U1> анонимный класс для ведущего (leader) - куратор, завю кафедрой, ректор;
 * @param <U2> анонимный класс для списка пользователей
 */
public abstract class Group<U1 extends User, U2 extends User> implements GroupImpl{
    U1 leader;
    List<U2> members;


    public Group(U1 leader, List<U2> members) {
        this.leader = leader;
        this.members = members;
    }

    /**
     * Возвращает ведущего
     * @return наследник User
     */
    public U1 getLeader() {
        return leader;
    }

    /**
     * Возвращает список участников
     * @return лист наследников User
     */
    public List<U2> getMembers() {
        return members;
    }


    @Override
    public String groupToString() {
        StringBuilder sb = new StringBuilder();
        for (U2 m: members) {
            sb.append(m.toString()).append("\n");
        }
        return sb.toString();
    }
}
