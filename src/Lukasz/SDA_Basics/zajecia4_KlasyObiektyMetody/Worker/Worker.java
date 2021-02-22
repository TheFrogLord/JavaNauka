package Lukasz.SDA_Basics.zajecia4_KlasyObiektyMetody.Worker;

public class Worker {

    private static int numberOfWorkers = 1; // dodałem licznik pracowników - rozbudowanie zadania

    private String name;
    private String lastName;
    private int age;
    private String hireDate;
    private int salary;
    private int idNumber;

    public Worker(String name, String lastName, int age, String hireDate, int salary, int idNumber) {

        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.hireDate = hireDate;
        this.salary = salary;
        this.idNumber = numberOfWorkers++;

    }

    public static int getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public String getHireDate() {
        return this.hireDate;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getIdNumber() {
        return this.idNumber;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void showWorker() {

        System.out.println("Imię: " + name);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Wiek: " + age);
        System.out.println("Data zatrudnienia: " + hireDate);
        System.out.println("Wynagrodzenie: " + salary);
        System.out.println("Numer id: " + idNumber);
    }


}


