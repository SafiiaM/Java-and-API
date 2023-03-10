package org.example.Obstacles;

import org.example.Creatures.Participant;

import java.util.Random;

public class Race extends Obstacles implements Barrier{
    private final int distance;

    public Race(String name) {
        super("Беговая дорожка", name);
        this.distance = random.nextInt(10,5000);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public boolean takeBarrier(Participant participant) {
        if (participant.getMaxRunDistance() > distance) {
            participant.run(true);
            System.out.println(getDistance() + " m ");
            return true;
        }
        else {
            participant.run(false);
            System.out.println(getDistance() + " m ");
            return false;
        }
    }
}
