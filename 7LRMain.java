import java.util.Scanner;

class Person {
    String surname;
    String name;
    String middlename;
    String address;
    String education;
    int birthday_year;

    Person(String surname, String name, String middlename, String address, String education, int birthday_year) {
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.address = address;
        this.education = education;
        this.birthday_year = birthday_year;
    }
    public int vozrast(){
        int year = 2025;
        return (year - birthday_year);
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person Alexandr = new Person("Романов", "Александр", "Юрьевич", "Проспект Строителей 91", "Высшее", 1977);
        Person Grigory = new Person("Олятов", "Григорий", "Борисович", "Улица Ладожская 67", "Среднее", 1969);
        Person Pavel = new Person("Петренко", "Павел", "Игоревич", "Улица Ленина 81", "Среднее", 2000);
        Person Ivan = new Person("Столотов", "Иван", "Михайлович", "Проспект Победы 34", "Высшее", 1991);
        Person Bogdan = new Person("Богородов", "Богдан", "Сергеевич", "Улица Пушкина 56", "Начальное", 2012);
        Person[] people = {Alexandr, Grigory, Pavel, Ivan, Bogdan};

        System.out.println("Введите оптимальный возраст:");
        int average_age = scanner.nextInt();
        for (Person chelovek : people) {
            if (chelovek.vozrast() > average_age) {
                System.out.printf("%s %s %s старше %d лет\n",chelovek.surname,chelovek.name,chelovek.middlename,average_age);
            }
        }
        for (Person person : people) {
            if (person.education.equals("Высшее")) {
                System.out.printf("Люди с высшим образованием:%s %s %s\n",person.surname,person.name,person.middlename);
            }
        }
    }
}
