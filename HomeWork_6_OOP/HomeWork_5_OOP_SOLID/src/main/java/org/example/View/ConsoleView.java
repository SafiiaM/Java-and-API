package org.example.View;

/**
 * Модуль вывода информации в консоль
 * Реализован принцип открытости/закрытости:
 * Класс View не рефакторился, сделано расширение при помощи наследника ConsoleView
 */
public class ConsoleView extends View{
    public ConsoleView() {
    }

    public void show(String data){
        System.out.println(data);
    }
}