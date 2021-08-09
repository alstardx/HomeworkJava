package Lesson7.Homework.Parts;

import java.util.Random;

public class MaintenanceBay {
   private Random random = new Random();

   private int repairValue;
   private String name;
   private int maintenanceLevel;

   public MaintenanceBay( String name, int maintenanceLevel){
       this.name = name;
       this.maintenanceLevel = maintenanceLevel;
       this.repairValue = maintenance(15);

   }

   public void giveRepair( RobotPart robotPart){

       robotPart.getRepair(repairValue);
       System.out.println(name + " > " + " give repair to " + robotPart.getNameParts()
               + " " + repairValue + " points");
   }

     private int maintenance(int max){
      return  maintenanceLevel + random.nextInt(max);
     }

}
