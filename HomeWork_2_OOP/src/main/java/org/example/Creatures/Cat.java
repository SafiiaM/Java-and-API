package org.example.Creatures;

public class Cat extends Participant {
    private static String[] names = {"Живоглот", "Тимофей", "Барсик", "Мура", "Бегемот", "Елисей",
            "Петька", "Том", "Гарфилд", "О'Мэлли"};
    private static int count;

    public Cat() {
        super(random.nextInt(20, 400),
                random.nextInt(2, 5), "Кот", names[count++]);

    }
}