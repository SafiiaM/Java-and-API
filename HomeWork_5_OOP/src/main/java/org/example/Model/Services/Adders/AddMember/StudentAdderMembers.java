package org.example.Model.Services.Adders.AddMember;

import org.example.Model.Members.Student;
import org.example.Model.Services.UserService;

public class StudentAdderMembers extends UserAdderMembers {
    public StudentAdderMembers(UserService userService) {
        super(userService);
    }

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

