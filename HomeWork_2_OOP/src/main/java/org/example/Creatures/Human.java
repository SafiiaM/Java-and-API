package org.example.Creatures;

public class Human extends Participant {
    private static String[] names = {"Иван", "Петр", "Савелий", "Ирина", "Семен", "Егор", "Григорий",
            "Анна", "Ольга", "Наталья"};
    private static int count;
    public Human() {
        super(random.nextInt(500,800),
                random.nextInt(1,4), "Человек по имени ", names[count++]);
    }

}
