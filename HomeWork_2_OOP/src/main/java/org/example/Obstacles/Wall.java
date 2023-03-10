package org.example.Obstacles;

import org.example.Creatures.Participant;

public class Wall extends Obstacles implements Barrier{
    private final int height;

    public Wall(String name) {
        super("Стена", name);
        this.height = random.nextInt(1,8);
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean takeBarrier(Participant participant) {
        if (participant.getMaxJumpHeight() > height) {
            participant.jump(true);
            System.out.println(getHeight() + " m ");
            return true;
        }
        else {
            participant.jump(false);
            System.out.println(getHeight() + " m ");
            return false;
        }
    }
}
