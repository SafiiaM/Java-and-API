package org.example.AppSystem;

import org.example.AppSystem.Controller.Controller;
import org.example.AppSystem.Controller.ControllerWithLoad;
import org.example.AppSystem.FileWork.LoadEngine;
import org.example.AppSystem.FileWork.SaveEngine;
import org.example.AppSystem.FileWork.TestEngine;
import org.example.Model.Groups.StudyGroup;
import org.example.Model.Members.Student;
import org.example.Model.Members.Teacher;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

/**
 * Класс запуска системы
 */

public class AppSystem implements SystemImpl {
    String pathConfig;
    String pathDir;
    TestEngine testEngine;
    LoadEngine loadEngine;
    SaveEngine saveEngine;
    Controller controller;

    public AppSystem() throws Exception {
        this.pathConfig = "D:\\repo\\Business Analyst\\OOP\\Seminars\\HomeWork_6_OOP\\src\\main\\java\\org" +
                "\\example\\AppSystem\\Config.txt";
        this.pathDir = readPathDir(pathConfig);
        this.testEngine = new TestEngine(pathDir);
        this.loadEngine = new LoadEngine(pathDir);
        this.saveEngine = new SaveEngine(pathDir);
    }


    private String readPathDir(String pathConfig) throws Exception {
        return new BufferedReader(new FileReader(pathConfig)).readLine();
    }

    @Override
    public void startSystem() {
        boolean[] flags = testEngine.searchFiles(pathDir);
        if (flags[0] || flags[1] || flags[2]) {
            List<Student> students = null;
            List<Teacher> teachers = null;
            List<StudyGroup> studyGroups = null;
            if (flags[0])
                students = loadEngine.loadStudents();
            if (flags[1])
                teachers = loadEngine.loadTeachers();
            if (flags[2])
                studyGroups = loadEngine.loadStudyGroups();
            controller = new ControllerWithLoad(students, teachers, studyGroups);
        } else {
            controller = new Controller();
            controller.start();
        }
    }
}