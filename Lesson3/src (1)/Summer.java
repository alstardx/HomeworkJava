

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 19.07.2021
 */

public class Summer {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
//        System.out.println("Program start");
//
//        System.out.println(random.nextInt()); //[-int; +int]
//        System.out.println(random.nextFloat());//[0;1)
//        System.out.println(random.nextInt(55));
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print(random.nextInt(55) + " ");
//        }
//
//        System.out.println();
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print(randomIntRange(-30, 40) + " ");
//        }
//
//        System.out.println();
//        getUserInfo("Enter your name" ); // Str
//        getUserInfo("Please enter your value:"); // int
//        myMath(getUserInfo("Enter your name" ), Integer.parseInt(getUserInfo("Please enter your value")));
//        myMath(scanner.next(), scanner.nextInt());
//        System.out.println(calculator());

//        for (int i = 0; i < 5; i++) {
//            System.out.println("Random String is " + randomString(10));
//        }
//        String tmpName = scanner.next();
//
//        greetingUser(tmpName);
//
//        int tmpValue = scanner.nextInt();
//        System.out.println("Result = " + calculator(tmpValue));

//        greetingUser("Alex");
//        greetingUserNameWithSurname("ALex", "Gladkov"); FAIL
//        greetingUserNameWithSurnameAndId(345, "ALex", "Gladkov"); FAIL
//        greetingUser(324, "Qwerty", "asdasd");


//        scanner.close();

//        int[] myIntArray = new int[5];
//        myIntArray[0] = 5;
//        myIntArray[1] = 20;
//        myIntArray[2] = -2;
//        myIntArray[3] = 0;
//        myIntArray[4] = -30;
//
//        System.out.println("Value " + getValueInOurArray(myIntArray, 5));
//        System.out.println(myIntArray[3]);
//
//        myIntArray[0] = 7;

//        int[] myTestArray = new int[50];

//        for (int i = 0; i < myTestArray.length; i++) {
//            myTestArray[i] = random.nextInt(50);
//        }
//
//        for (int i = 0; i < myTestArray.length; i++) {
//            System.out.print(myTestArray[i] + " ");
//        }
//
//        String[] boxes = new String[30]; // Box # i
//        String[] cats = new String[45]; // Cat # i
//        String[] cars = new String[150]; //Car # i
//        fillArrayAndPrint(boxes, "Box #");
//        fillArrayAndPrint(cats, "Cat #");
//        fillArrayAndPrint(cars, "Car #");

//        int[] myArray = calculateRandomMassive(30);
//        printArray(myArray);
//
//        printArray(calculateRandomMassive(50));

//        String[] school = {"Name1", "Name2", "Name3", "Name4", "Name5", "Name6"};
//        printArray(school);

//        String[] lottery = calculateRandomMassive(random.nextInt(15), randomIntRange(50, 70), randomIntRange(120, 130));
//        printArray(lottery);

//        int[][] myArray2 = new int[4][10];
//        int count = 0;
//        for (int i = 0; i < myArray2.length; i++) {
//            for (int j = 0; j < myArray2[i].length; j++) {
//                myArray2[i][j] = count;
//                count++;
//            }
//        }
//
//        for (int i = 0; i < myArray2.length; i++) {
//            for (int j = 0; j < myArray2[i].length; j++) {
//                System.out.print(myArray2[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        String[][] myTestArrayString = {{"Name1", "Name2"}, {"Name3", "Name4","Name5"}};
//
//        for (int i = 0; i < myTestArrayString.length; i++) {
//            for (int j = 0; j < myTestArrayString[i].length; j++) {
//                System.out.print(myTestArrayString[i][j] + "\t");
//            }
//            System.out.println();
//        }

        int[][][] myIntArray3 = new int[3][4][5];
        float[][][][][][][][][][] myFloatArray10 = new float[1][2][3][4][5][6][7][8][9][10];

    }

    public static String[] calculateRandomMassive(int size, int min, int max) {
        String[] tmpArray = new String[size];
        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = randomString(randomIntRange(min, max));
        }
        return tmpArray;
    }

    public static void fillArrayAndPrint(String[] array, String nameOfBox) {
        for (int i = 0; i < array.length; i++) {
            array[i] = nameOfBox + " " + (i + 1);
        }
        printArray(array);
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
        System.out.println();
    }

    public static int[] calculateRandomMassive(int size) {
        int[] tmpArray = new int[size];
        for (int i = 0; i < tmpArray.length; i++) {
            tmpArray[i] = randomIntRange(-50, 50);
        }
        return tmpArray;
    }

//    public static int getValueInOurArray(int[] array, int indexValue) {
//        return array[indexValue];
//    }

//    public static void greetingUser(String userName) {
//        System.out.println("Hello my dear " + userName);
//    }
//
//    public static void greetingUser(String userName, String userSurname) {
//        System.out.println("Hello my dear " + userName + " " + userSurname);
//    }
//
//    public static void greetingUser(int id, String userName, String userSurname) {
//        System.out.println("Hello my dear " + userName + " " + userSurname + ". Our ID#" + id);
//    }
//
//    public static void greetingUser(String userName, String userSurname, int id) {
//        System.out.println("Hello my dear " + userName + " " + userSurname + ". Our ID#" + id);
//    }

//    public static void greetingUserNameWithSurname(String userName, String userSurname) {
//        System.out.println("Hello my dear " + userName + " " + userSurname);
//    }
//
//    public static void greetingUserNameWithSurnameAndId(int id, String userName, String userSurname) {
//        System.out.println("Hello my dear " + userName + " " + userSurname + ". Our ID#" + id);
//    }

    //    public static int calculator(int value) {
//        return value * 2 - 15;
//    }
//
//    public static void myMath(String name, int value) {
//        System.out.println("Dear " + name + " your answer is " + calculator(value));
//    }
//
//    public static String getUserInfo(String messageToUser) {
//        System.out.print(messageToUser + ": ");
//        return scanner.next();
//    }
//
    public static int randomIntRange(int min, int max) {
        int diff = max - min;
        int value = random.nextInt(diff + 1);
        return min + value;
    }

    public static String randomString(int value) {
        String tmpString = "";

        for (int i = 0; i < value; i++) {
            int valueAscii = randomIntRange(70, 90);
            char tmpChar = (char) valueAscii;
            tmpString += tmpChar;
        }

        return tmpString;
    }
}
