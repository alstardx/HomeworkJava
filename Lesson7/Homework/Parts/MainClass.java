package Lesson7.Homework.Parts;

public class MainClass {
    public static void main(String[] args) {
        Robot robot1 = new Robot("T1000");
        Robot robot2 = new Robot("T2000");
//        MaintenanceBay maintenanceBay = new MaintenanceBay("Maintenance1",1 );

        robot1.attackLeft(robot2);
        robot1.attackRight(robot2);
        robot1.speak();
        robot2.goToMaintenanceShop();




    }
}
