package Lesson0001.HW1.Obstacles;

import Lesson0001.HW1.Participant;

public class Wall extends Obstacle{
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant participant) {
        participant.jump(height);
    }
}
