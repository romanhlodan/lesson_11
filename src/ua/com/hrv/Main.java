package ua.com.hrv;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = {randomNumber(1, 500), randomNumber(1, 500), randomNumber(1, 500), randomNumber(1, 500), randomNumber(1, 500), randomNumber(1, 500), randomNumber(1, 500), randomNumber(1, 500), randomNumber(1, 500), randomNumber(1, 500), randomNumber(1, 500)};
        System.out.println("До сортування: " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Відсортований по зростанню:" + Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Відсортований по спаданню: " + Arrays.toString(arr));

        Car[][] cars = new Car[randomNumber(1, 10)][randomNumber(1, 10)];
        System.out.println("Довжина масиву: "+cars.length);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            menu();
            switch (scanner.nextInt()) {

                case 1: {
                    Car[] carr = new Car[]{new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12)))};
                    System.out.println(Arrays.deepToString(carr));
                    break;
                }
                case 2: {
                    Car[] carr = new Car[]{new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12))), new Car(randomHP(90, 550), randomYear(2000, 2023), new Helm(randomHelm(10, 17), "шкіра"), new Engine(randomEng(3, 12)))};
                    Arrays.fill(carr, new Car(110, 2014, new Helm(15, "алькантара"), new Engine(4)));
                    System.out.println(Arrays.deepToString(carr));
                }
            }
        }
    }

    public static int randomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int randomEng(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int randomHelm(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int randomHP(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static int randomYear(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void menu() {
        System.out.println("1 - Вивести масив");
        System.out.println("2 - Задати статичні значення");
    }

}
