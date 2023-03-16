package org.example.game;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        int num;
        Game game = null;
        int sizeWord = 4;
        int maxTry = 10;
        Scanner in = new Scanner(System.in);
        System.out.println("1-цифры");
        System.out.println("2-буквы EN");
        System.out.println("3-буквы RU");
        System.out.println("Выберите игру");
        do {
            num= in.nextInt();
            switch (num) {
                case 1:
                    game = new NumberGame();
                    break;
                case 2:game=new WordEnglishGame();
                    break;
                case 3:game=new WordRussianGame();
                    break;
                default:
                    System.out.println("Введите игру из списка");
            }
        } while (num < 1 || num > 3);

        game.newGame(sizeWord, maxTry);
        System.out.println(game.getLog());
    }
}
