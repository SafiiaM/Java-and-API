// Урок 2. Принципы ООП Абстракция и интерфейсы. Пример проектирования
//Домашнее задание на закрепление :
//
//1)Создайте три класса: Человек, Кот, Робот, которые наследуются от одного класса. Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
//2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
//должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
//печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
//(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
//этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
//списку он препятствий не идет.


package org.example;

import org.example.Creatures.Robot;
import org.example.Creatures.Cat;
import org.example.Creatures.Human;
import org.example.Creatures.Participant;
import org.example.Obstacles.Obstacles;
import org.example.Obstacles.Race;
import org.example.Obstacles.Wall;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int groupSize = 10;
        Participant[] group = new Participant[groupSize];
        for (int i = 0; i < groupSize; i++)
            group[i] = randParticipants(i);

        int barriersCount = 10;
        Obstacles[] barriers = new Obstacles[barriersCount];
        for (int i = 0; i < barriersCount; i++)
            barriers[i] = randBarriers(i);

        for (Participant p: group) {
            boolean check = true;
            for (Obstacles o : barriers)
                if (!o.takeBarrier(p)) {
                    check = false;
                    break;
                }
            if (check) p.finish();
            System.out.println();
        }
    }

    public static Participant randParticipants (int i){
        Random random = new Random();
        int choice = random.nextInt(3);

        if (choice == 0)
            return new Human();
        else if (choice == 1)
            return new Robot();
        else
            return new Cat();
    }

    public static Obstacles randBarriers (int i){
        Random random = new Random();
        String name = String.format("Barriers_№" + i);
        int choice = random.nextInt(2);

        if (choice == 0)
            return new Race(name);
        else
            return new Wall(name);
    }
}