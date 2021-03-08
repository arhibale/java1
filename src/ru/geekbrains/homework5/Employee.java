package ru.geekbrains.homework5;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private int phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, int phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void employeeInformation() {
        System.out.println(
                "------------------------------------------\n" +
                "Имя сотрудника: " + fullName + "\n" +
                "Должность сотрудника: " + position + "\n" +
                "Email сотрудника: " + email + "\n" +
                "Номер телефона сотрудника: " + phone + "\n" +
                "ЗП сотрудника: " + salary + "\n" +
                "Возраст сотрудника: " + age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
