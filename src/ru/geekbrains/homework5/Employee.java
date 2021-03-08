package ru.geekbrains.homework5;

public class Employee {

    private String fullName;
    private String position;
    private String email;
    private int phone;
    private int wages;
    private int age;

    public Employee(String fullName, String position, String email, int phone, int wages, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.wages = wages;
        this.age = age;
    }

    public void employeeInformation() {
        System.out.println("Имя сотрудника: " + fullName + "\n" +
                "Должность сотрудника: " + position + "\n" +
                "Email сотрудника: " + email + "\n" +
                "Номер телефона сотрудника: " + phone + "\n" +
                "ЗП сотрудника: " + wages + "\n" +
                "Возраст сотрудника: " + age + "\n" +
                "------------------------------------------");
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

    public int getWages() {
        return wages;
    }

    public void setWages(int wages) {
        this.wages = wages;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
