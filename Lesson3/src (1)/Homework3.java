import java.util.Arrays;
import java.util.Random;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Задание 1.");
        myArray01();
        System.out.println();
        System.out.println("Задание 2.");
        my100Array();
        System.out.println();
        System.out.println("Задание 3.");
        arrayDouble();
        System.out.println();
        System.out.println("Задание 4.");
        squareArray(7,0);
        System.out.println("Задание 5.");
        lengthArray(14,34);
        System.out.println();
        System.out.println("Задание 6.");
        minMaxElements();
        System.out.println();
        System.out.println("Задание 7.");
        System.out.println(balancedArray());;


    }

    //1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void myArray01() {
        int[] myArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(myArray));
        int changeValue0 = 0;
        int changeValue1 = 1;
        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] == 0) {
                myArray[i] = changeValue1;
            } else {
                myArray[i] = changeValue0;
            }

            System.out.print(myArray[i] +", ");

        }
    }

    // 2. Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void my100Array(){
        int [] new100Array = new int[100];
        for ( int i =0; i< 100; i++ ){
            new100Array[i] = i + 1;
            System.out.print(new100Array[i] + " ");
        }
    }
    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
// пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void arrayDouble() {
        int[] newArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(newArray));
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] < 6) {
                newArray[i] *= 2;
            }
            System.out.print(newArray[i] + ", ");
        }
    }
    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами
// (можно только одну из диагоналей, если обе сложно).
// Определить элементы одной из диагоналей можно по следующему принципу:
// индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void squareArray(int size, int count){
        int[][] square = new int[size][size];
        for (int i = 0; i<size; i++ ){
            for ( int j=0; j<size; j++){
                square [i][j] = count;
                //  count ++;
                if ( i==j || i+j==size-1){
                    square[i][j]=1;
                }
                System.out.print(square[i][j] +"\t");
            }
            System.out.println();

        }
    }

    //5. Написать метод, принимающий на вход два аргумента:
// len и initialValue, и возвращающий одномерный массив типа int длиной len,
// каждая ячейка которого равна initialValue;
    public static void lengthArray(int len, int initialValue){
        int [] modifiedLengthArray = new int[len];
        for (int i=0; i<len; i++){
            modifiedLengthArray[i]=initialValue;
            System.out.print(modifiedLengthArray[i] +"\t");
        }
    }
    //6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void minMaxElements(){
        int [] someArray = new int[12];
        int i;
        int min = someArray[0];
        int max = someArray[0];
        for ( i=0; i< someArray.length; i++){
            someArray[i] = randomIntRange(-30,50);
            if (min > someArray[i]){
                min = someArray[i];
            }
            if (max < someArray[i]){
                max = someArray[i];
            }
            System.out.print(someArray[i] +"\t");
        }


        System.out.println();
        System.out.println("min: "+ min +";" + " " +"max: " +max);
    }
    //** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//**Примеры:
//checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
//checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
//
//граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
    public static boolean balancedArray() {
        int sumRight = 0;
        int sumLeft = 0;
        int [] arr = {1, 2, 3, 4, 8, 2, 9, 7};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1; i++) {
            sumLeft += arr[i];
            for (int j = i + 1; j < arr.length; j++)
                sumRight += arr[j];
            if (sumLeft == sumRight)
                return true;
            sumRight = 0;
        }
        return false;
    }



    public static Random random = new Random();
    public static int randomIntRange(int min, int max) {
        int diff = max - min;
        int value = random.nextInt(diff + 1);
        return min + value;
    }
}

