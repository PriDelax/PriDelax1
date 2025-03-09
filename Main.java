class Person {
    String name;
    String surname;
    int birthday_year;

    Person(String name, String surname, int birthday_year) {
        this.name = name;
        this.surname = surname;
        this.birthday_year = birthday_year;
    }

    void displayPerson() {
        System.out.println(this.name + " " + this.surname + " " + this.birthday_year);
    }

    void ALO(Book book, Car car) {
        System.out.println(this.name + " читает книгу " + book.book_name + " про машину " + car.mark);
    }
}
class Car{
    String mark;
    int year;
    int engine_mass;
    Car(String mark,int year,int engine_mass){
        this.mark = mark;
        this.year = year;
        this.engine_mass = engine_mass;
    }
    void displayCar(){
        System.out.println(this.mark + " " + this.year + " " + this.engine_mass);
    }
}
class Book{
    String book_name;
    String author;
    int book_year;
    Book(String book_name,String author,int book_year){
        this.book_name = book_name;
        this.author = author;
        this.book_year = book_year;
    }
    void displayBook(){
        System.out.println(this.book_name + " " + this.author + " " + this.book_year);
    }
}
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Клэш Рояль","ген",2016);
        Car car = new Car("Хог 2.6",2018,77);
        Book book = new Book("Теория бесконечного эликсира","Мармок",2025);
        person.ALO(book,car);
    }
}