package ru.gb.l5.homerork;

public class Employee {
    private String name;
    private String position;
    private String email;
    private long phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, long phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String toString(){
        return(name + " " + " " + position + " " + " " + email + " " + " " + phone + " " + " " + salary + " " + " " + age);
    }

    public static void main(String[] args) {

        Employee[] empBar = new Employee[5];
        empBar[0] = new Employee("Ivanov Ivan Ivanovich", "manager", "ivanov@mail.ru", 89119119191l, 100000, 45);
        empBar[1] = new Employee("Petrov Petr Petrovich", "administrator", "petrov@mail.ru", 89119229292l, 80000, 35);
        empBar[2] = new Employee("Nikolaev Nikolay Nikolaevich", "cook", "nikolaev@mail.ru", 89119339393l, 50000, 42);
        empBar[3] = new Employee("Vasiliev Vasiliy Vasilievich", "bartender", "vasaliev@mail.ru", 89119449494l, 30000, 25);
        empBar[4] = new Employee("Aleksandrova Aleksandra Aleksandrovna", "waiter", "aleksa@mail.ru", 891195559595l, 10000, 18);
        for (Employee employee: empBar) {
            if (employee.getAge() > 40){
                System.out.println(employee);
            }
        }
    }
}