package Lesson0001.HW1.Obstacles;

import Lesson0001.HW1.Participant;

public class Pool extends Obstacle{

        private int length;

        public Pool(int length) {
            this.length = length;
        }

        @Override
        public void doIt(Participant participant) {
            participant.swim(length);
        }
}
