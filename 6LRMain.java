import java.util.Scanner;

class Reader{
    String FIO;
    int number;
    String facility;
    String birthday_year;
    String phone_number;
    Reader(String FIO,int number,String facility,String birthday_year,String phone_number){
        this.FIO = FIO;
        this.number = number;
        this.facility = facility;
        this.birthday_year = birthday_year;
        this.phone_number = phone_number;
    }
    public void takeBook(int books){
        if(books == 1){
            System.out.printf("%s взял %d книгу\n", FIO, books);
        }
        else if (books == 0) {
            System.out.printf("%s не брал книги\n", FIO);
        }
        else {
            System.out.printf("%s взял книги в количестве %d штук\n", FIO, books);
        }
    }
    public void takeBook(String... booklist){
        System.out.printf("%s взял книги: "+ String.join(", " , booklist) + "\n", FIO);
    }
    public void returnBook(int books){
        if(books % 10 == 1){
            System.out.printf("%s вернул %d книгу\n", FIO, books);
        }
        else if(books == 0){
            System.out.printf("%s не возвращал книги\n", FIO);
        }
        else{
            System.out.printf("%s вернул книги в количестве %d штук\n", FIO, books);
        }
    }
    public void returnBook(String... booklist){
        System.out.printf("%s вернул книги: \n"+ String.join(", " ,booklist) + "\n", FIO);
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reader Andrei = new Reader("Богонин А.К.",69,"Механический","01.01.2000","87693425663");
        Reader Fedor = new Reader("Герасимов Ф.Е.",52,"Филологический","02.02.1999","82395671098");
        Reader Danil = new Reader("Кердяшов Д.Н.",420,"Математический","03.03.1998","89418762356");
        Reader Egor = new Reader("Перов Е.Г.",42,"Биологический","04.04.1997","82485410932");
        Reader Dima = new Reader("Архипов.Д.В",14,"Физический","05.05.1996","89012349992");
        Reader[] chitateli = {Andrei, Fedor, Danil, Egor, Dima};
        System.out.println("Введите номер билета того, кто взял количество книг");
        int number = scanner.nextInt();
        for(int i = 0; i <= chitateli.length;i++){
            if(number == chitateli[i].number){
                System.out.println("Сколько книг было взято?");
                int kol = scanner.nextInt();
                chitateli[i].takeBook(kol);
                String[] Books = new String[kol];
                for(int j =0; j<kol;j++){
                    System.out.println("Какие книги были взяты?");
                    Books[j] = scanner.next();
                }
                chitateli[i].takeBook(Books);
                break;
            }
        }


        System.out.println("Введите номер билета того, кто вернул количество книг");
        number = scanner.nextInt();
        for(int i = 0; i < chitateli.length;i++){
            if(number == chitateli[i].number){
                System.out.println("Сколько книг вернули?");
                int kol = scanner.nextInt();
                chitateli[i].returnBook(kol);
                String[] Books = new String[kol];
                for(int j =0; j<kol;j++){
                    System.out.println("Какие книги вернули??");
                    Books[j] = scanner.next();
                }
                chitateli[i].returnBook(Books);
                break;
            }
        }

    }
}
