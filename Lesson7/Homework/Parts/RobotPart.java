package Lesson7.Homework.Parts;


import java.util.Random;

public class RobotPart {

    private Random random = new Random();
    protected boolean isIntact;
    protected int structureHealth;
    protected String nameParts;
    protected int robotLevel;
    protected Robot robot;

    public RobotPart(Robot robot, String nameParts) {
        this.robot = robot;
        this.isIntact = true;
        this.structureHealth = 100;
        this.nameParts = nameParts;
    }

    public void getDamage(int value) {
        this.structureHealth -= value;
        System.out.println(robot.getName() + " > " + this.nameParts + " get damage " + value + " point(s)");
    }
    public void getRepair( int value) {
        this.structureHealth += value;
        System.out.println(robot.getName() + " > " + this.nameParts + " got repaired for " + value + " point(s)");
    }

    public boolean getStatusPart()  {
        return this.structureHealth > 0;
    }

    protected int generateRandomBorder(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    protected int generateRandomValue(int max) {
        return random.nextInt(max);
    }

    public String getNameParts() {
        return nameParts;
    }


}
