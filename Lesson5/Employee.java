package Lesson5;
//1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    private String fullName;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;
    //2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Employee(String fullName, String position, String email, int phone, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;

    }
    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void employeeInfo(){
        System.out.println("Employee Full Name: " + fullName + ";");
        System.out.println("Position: " + position + ";");
        System.out.println("email: " + email + ";");
        System.out.println("Phone Number: " + phone + ";");
        System.out.println("Salary: " + salary +";");
        System.out.println("Age: " + age + ".");
        System.out.println();
    }

    int getAge(){
        return age;
    }

}
