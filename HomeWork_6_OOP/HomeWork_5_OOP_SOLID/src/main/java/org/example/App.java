/*Урок 6. ООП Дизайн и Solid
Дз на закрепление:
Взять реализованный код в рамках последнего семинара (5) и продемонстрировать применение принципов,
усвоенных на семинаре. Нужно в проекте прокомментировать участки кода, которые
рефакторим, какой принцип применяем и почему

 */

package org.example;

import org.example.AppSystem.AppSystem;
import org.example.AppSystem.Controller.Controller;

public class App {
    public static void main(String[] args) throws Exception{
        new AppSystem().startSystem();
//        new Controller().start();
    }
}