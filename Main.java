import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Ввод размерности массива: ");
        int size = scanner.nextInt();
        int[][] mas = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mas[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Первоначальный массив:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Массив сортировкой простыми обменами:");
        bubbleSort(mas);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Массив сортировкой расческой:");
        combSort(mas);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void bubbleSort(int[][] mas) { //сортировка простыми обменами
            for (int z = 0; z < mas.length;z++) {
                for (int i = 0; i < mas.length - 1; i++) {
                    for (int j = 0; j < mas.length - i - 1; j++) {
                        if (mas[z][j + 1] > mas[z][j]) {
                            int smena = mas[z][j];
                            mas[z][j] = mas[z][j + 1];
                            mas[z][j + 1] = smena;
                        }
                    }
                }
            }
        }

    public static void combSort(int[][] mas) { //сортировка расческой
        double Factor = 1.247;
        int step = mas.length - 1;
        while (step >= 1) {
            for (int z = 0; z < mas.length;z++) {
                for (int i = 0; i + step < mas.length; ++i) {
                    for (int j = 0; j + step < mas.length - 1; ++j) {
                        if (mas[z][j + 1] > mas[z][j]) {
                            int smena = mas[z][j];
                            mas[z][j] = mas[z][j + 1];
                            mas[z][j + 1] = smena;
                        }
                    }
                    step /= Factor;
                }
            }
        }
    }
}
