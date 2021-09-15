package Lesson0001.HW1;

import Lesson0001.HW1.Animals.Cat;
import Lesson0001.HW1.Animals.Dog;
import Lesson0001.HW1.Animals.Turtle;
import Lesson0001.HW1.Obstacles.*;

public class Main {
    public static void main(String[] args) {

        Course c = new Course(new Obstacle[] {
                new Cross(100),
                new Wall(3),
                new Pool(50)
        }); // Создаем полосу препятствий
        Team team = new Team("Дружба",
                new Cat("Барсик", 120, 5, 30),
                new Dog("Палкан", 150, 2, 60),
                new Cat("Мурзик", 99, 6, 70),
                new Turtle("Леонардо", 30, 0, 120));  // Создаем команду
        team.getTeamInfo();

        c.doIt(team);               // Просим команду пройти полосу
        team.showResults();         // Показываем результаты

    }
}
