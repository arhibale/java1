package ru.geekbrains.homework5;

public class Main {
    public static void main(String[] args) {

        Employee[] personArray = new Employee[5];

        personArray[0] = new Employee("Ефремов Нинель Лукьевич", "Администратор", "efremov@email.com", 880035, 30000, 24);
        personArray[1] = new Employee("Калинин Ефим Валерьевич", "Аналитик", "kalinin@email.com", 880046, 40000, 35);
        personArray[2] = new Employee("Комиссаров Лаврентий Якунович", "Аудитор", "komisarov@email.com", 880057, 50000, 46);
        personArray[3] = new Employee("Кудряшов Гарри Германович", "Аукционист", "kydrashov@email.com", 880068, 60000, 57);
        personArray[4] = new Employee("Щербаков Леонард Анатольевич", "Биржевой маклер", "sherbakov@email.com", 880089, 70000, 44);

        for (Employee employee : personArray) {
            if (employee.getAge() >= 40) {
                employee.employeeInformation();
            }
        }
    }
}
