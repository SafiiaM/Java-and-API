package org.example.Creatures;

public class Robot extends Participant {
    private static String[] names = {"Электроник", "R2-D2", "C-3PO", "AIESEC", "Вертер", "Бишоп",
            "Sonny", "Wally", "Робокоп", "Вайнона"};
    private static int count;
    public Robot() {
        super(random.nextInt(100,10000),
                random.nextInt(0,10), "Робот", names[count++]);
    }
}
