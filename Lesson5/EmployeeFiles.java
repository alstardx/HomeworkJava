package Lesson5;

public class EmployeeFiles {
    public static void main(String[] args) {
        Employee employee1 = new Employee(
                "Ivanov Peter",
                "Manager",
                "pivanov@mail.ru",
                123456788,
                500000,
                32);

        employee1.employeeInfo();
        System.out.println();




//4. Создать массив из 5 сотрудников.
        Employee[] employeeArray = {
                new Employee("Gusin Vladimir",
                        "Project Manager",
                        "vgusin@thisproject.ru",
                        784634534,
                        200000,
                        35),
                new Employee("Kozlov Ivan",
                        "Programmer",
                        "ikozlov@thisproject.ru",
                        785435824,
                        160000,
                        28),
                new Employee("Koroleva Anastasija",
                        "Software Engineer",
                        "akorolova@thisproject.ru",
                        764836453,
                        170000,
                        25),
                new Employee("Fedorov Anton",
                        "QA Engineer",
                        "afedorov@thisproject.ru",
                        765434234, 145000,
                        42),
                new Employee("Maslova Ilona",
                        "Designer",
                        "imaslova@thisproject.ru",
                        746353424,
                        156000,
                        47)};

        allEmployeeFiles(employeeArray);//список всех сотрудников

//5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        int ageValue = 40;
        System.out.println("Employees older than " + ageValue + ":");
        certainAgeEmployees(employeeArray, ageValue);

    }

    public static void allEmployeeFiles(Employee[] employeeArray){
        for (int i = 0; i < employeeArray.length; i++ ){
            employeeArray[i].employeeInfo();
        }
    }

    public static void certainAgeEmployees(Employee[] employeeArray, int valueAge){
        for (int i = 0; i < employeeArray.length; i++ ){
            if (employeeArray[i].getAge()> valueAge){
                employeeArray[i].employeeInfo();
            }
        }
    }





}
