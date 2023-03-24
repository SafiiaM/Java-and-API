package org.example.AppSystem.FileWork;

import java.io.File;

/**
 * Класс проверки DB
 */

public class TestEngine implements TestImpl{
    String pathDir;
    boolean[] flags;

    public TestEngine(String pathDir) {
        this.pathDir = pathDir;
        flags = new boolean[3];
    }

    @Override
    public boolean[] testFiles(String pathDir) {
        for (String s: new File(pathDir).list()) {
            if (s.equals("students.txt"))
                flags[0] = true;
            else if (s.equals("teachers.txt")) {
                flags[1] = true;
            } else if (s.equals("StudyGroups.txt")) {
                flags[2] = true;
            }
        }
        return flags;
    }
}
