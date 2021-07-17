import java.sql.SQLOutput;

public class Homework2 {
    public static void main(String[] args) {
// 1. Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.
        System.out.println(sumBetween(1, 7));
        System.out.println(sumBetween(5, 8));
        System.out.println(sumBetween(12, 15));
        System.out.println("****************");
//2. Написать метод, которому в качестве параметра передается целое число,
// метод должен напечатать в консоль, положительное ли число передали или отрицательное.
// Замечание: ноль считаем положительным числом.
        numberSign(6);
        numberSign(-4);
        System.out.println("****************");
//3. Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное,
// и вернуть false если положительное.
        System.out.println(invertNumberSign(6));
        System.out.println(invertNumberSign(-23));
        System.out.println("****************");
//4. Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, указанное количество раз;
        stringIterations("Hello", 5);
        System.out.println("****************");
//5. * Написать метод, который определяет, является ли год високосным,
// и возвращает boolean (високосный - true, не високосный - false).
// Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        System.out.println(leapYear(2020));
    }

    //1. Задание:
    public static boolean sumBetween(int a, int b) {
        return (a + b >= 10 && a + b <= 20);
    }

    // 2.Задание:
    public static void numberSign(int a) {
        if (a < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }

    //3.Задание:
    public static boolean invertNumberSign(int c) {
        return (c < 0);
    }

    //4. Задание:
    public static void stringIterations(String strng, int d) {
        for (int i = 0; i < d; i++) {
            System.out.println(strng);
        }
    }

    //5. Задание:
    public static boolean leapYear(int year) {
        return year%4 ==0 && year%100 !=0 ||year %400==0 ;
    }


}
