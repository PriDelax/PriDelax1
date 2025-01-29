import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        System.out.println("Введите верхний предел: ");
        double last = print.nextDouble();
        while(last < 0){
            System.out.println("Предел не опускается ниже 0");
            System.out.println("Введите верхний предел: ");
            last = print.nextDouble();
        }
        System.out.println("Введите число x: ");
        double x = print.nextDouble();
        while (x < 0){
            System.out.println("x должен быть больше 0");
            System.out.println("Введите число x: ");
            x = print.nextDouble();
        }
        double sum = 0;
        for(double n = 0; n <= last; n++) {
            double res = 2 * ((Math.pow(x - 1, 2 * n + 1)) / ((2 * n + 1) * (Math.pow(x + 1, 2 * n + 1))));
            sum += res;
        }
        System.out.println(sum);
    }
}