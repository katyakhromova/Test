package src;

import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
        ifMethod();
        switchMethod();
    }

    //#1 task

    /*Вы вводите число 1, 2 или 3, а программа должна сказать,
    какое число ввёл пользователь: 1, 2, или 3.
    (Пример вывода: Вы ввели число 1) - сделать двумя способами через if and switch.
    */

    //if
    public static void ifMethod() {
        System.out.print("Введите число 1, 2 или 3: ");
        Scanner inputNumber = new Scanner(System.in);
        int i = inputNumber.nextInt();
        if (i == 1) {
            System.out.println("Вы ввели число 1");
        } else if (i == 2) {
            System.out.println("Вы ввели число 2");
        } else if (i == 3) {
            System.out.println("Вы ввели число 3");
        } else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
    }

    //switch
    public static void switchMethod() {
        System.out.println("Введите 1, 2 или 3");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        switch (number) {
            case 1:
                System.out.println("Вы ввели число 1");
                break;
            case 2:
                System.out.println("Вы ввели число 2");
                break;
            case 3:
                System.out.println("Вы ввели число 3");
                break;
            default:
                System.out.println("Вы ввели неправильное число");
        }
        //System.out.println();
    }

    public static void secondTaskMethod() {
        System.out.println();
    }

    public static void thirdTaskMethod() {
        System.out.println();
    }

    public static void fourthTaskMethod() {
        System.out.println();
    }
}
