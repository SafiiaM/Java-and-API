package org.example.ComplexCalc.Model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger implements ILogger {
    private static final String filePath = "D:\\Business Analyst\\ООП\\Семинары\\HomeWork_7_OOP\\src\\main\\java\\org\\example\\log.txt";
            
    private BufferedWriter bw;

    public Logger() {
        try {
            this.bw = new BufferedWriter(new FileWriter(filePath, true));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void newLog(String log) throws IOException {
        bw.write(log);
        bw.flush();
    }

    @Override
    public void end() throws IOException {
        bw.close();
    }
}

