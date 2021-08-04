package Lesson6;

import java.util.Random;

public class Homework6 {
    public static  Random random =new Random();
    public static void main(String[] args) {
//  3. У каждого животного есть ограничения на действия
//  (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//  4. * Добавить подсчет созданных котов, собак и животных.

        Cat[] cats = {new Cat("Барсик"),
                new Cat("Мурзик"),
                new Cat("Рики-Тики-Тави")};

        Dog[] dogs = {new Dog("Рекс"),
                new Dog("Мухтар"),
                new Dog("Цезарь")};

        animalActions(cats);
        animalActions(dogs);
//  4. * Добавить подсчет созданных животных.
        System.out.println("Количество всех животных: " + petArraySize(cats, dogs));
    }
    public static int petArraySize(Cat[] cats, Dog[] dogs){
        return  cats.length + dogs.length; }
    public static int animalArraySize;
    public static void animalActions(Animals[] arr){
        int i;
        for ( i =0; i < arr.length; i++){
            arr[i].run(randomRange(100, 600));
            System.out.println("<<Нужно было пробежать: " + arr[i].getDistance() + "м>>");
            arr[i].swim(randomRange(5, 15));
            System.out.println("<<Нужно было проплыть: " + arr[i].getDistance() + "м>>");
        }
//        4. * Добавить подсчет созданных котов, собак;
        System.out.println("Количество " + arr[animalArraySize].getPluralTypeAnimal() + ": " + i + ".");
    }

    public static int randomRange(int  min, int max){ return random.nextInt(max - min + 1) + min;}
}

//1. Создать классы Собака и Кот с наследованием от класса Животное.

public abstract class Animals {

// 2. Все животные могут бежать и плыть.
// В качестве параметра каждому методу передается длина препятствия.
// Результатом выполнения действия будет печать в консоль.
// (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');


    protected String typeAnimal;
    protected  String pluralTypeAnimal;
    protected String name;
    protected int distance;
    protected int distanceMaxRun;
    protected int distanceMaxSwim;



    public Animals(String name){
        this.name = name;
    }
    public void action(int distance,int maxDistance, String actionForm){
        this.distance = distance;
        if ( distance <= maxDistance ) {
            System.out.println(typeAnimal + " " + name +  " " + actionForm + ": " + distance + "м");
        }
        else {
            System.out.println(typeAnimal + " " + name + " " + actionForm + " " + " всего " + distanceMaxRun + "м" + " и умер");
        }

    }


    public void run( int distance){
        action(distance, distanceMaxRun, "пробежал");
    }
    public void swim(int distance) {
      action(distance, distanceMaxSwim, "проплыл");
    }

    public void info(){
        System.out.println(typeAnimal + " " +  name + " Может пробежать " + distanceMaxRun + "м и проплыть "
                + distanceMaxSwim + "м");
    }

    public String getTypeAnimal(){ return typeAnimal;}
    public String getPluralTypeAnimal(){ return pluralTypeAnimal;}
    public String getName(){ return name;}
    public int getDistanceMaxRun(){ return distanceMaxRun;}
    public int getDistanceMaxSwim(){ return distanceMaxSwim;}
    public int getDistance(){ return distance;}
}

//1. Создать классы Собака и Кот с наследованием от класса Животное.

public class Cat extends Animals{

    public Cat(String name){
        super(name);
        typeAnimal = "Кот";
        pluralTypeAnimal ="котов";
        distanceMaxRun = 200;
        distanceMaxSwim = 0;
    }
    @Override
    public void swim( int distance) {
        this.distance = distance;
        System.out.println(name + " неумеет плавать.");
    }

}

//1. Создать классы Собака и Кот с наследованием от класса Животное.

public class Dog extends Animals{

    public Dog(String name){
        super(name);
        typeAnimal = "Собака";
        pluralTypeAnimal = " собак";
        distanceMaxRun = 500;
        distanceMaxSwim = 10;
    }
}
