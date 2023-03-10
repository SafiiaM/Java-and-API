package org.example.Creatures;

import java.util.Random;

public class Participant {
    protected static Random random = new Random();
    protected int maxRunDistance;
    protected int maxJumpHeight;
    protected String type;
    protected String name;

    public Participant(int maxRunDistance, int maxJumpHeight, String type, String name) {
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.type = type;
        this.name = name;
    }

    public void run(boolean check) {
        if (check)
            System.out.print(type + " " + name + " успешно пробежал ");
        else
            System.out.print(type + " " + name + " не смог пробежать ");
    }

    public void jump(boolean check) {
        if (check)
            System.out.print(type + " " + name + " преодолел барьер ");
        else
            System.out.print(type + " " + name + " не взял преодолеть барьер ");
    }

    public void finish (){
        System.out.println(type + " " + name + " первым пришел к финишу ");
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }
}

