package src;

import static src.FirstTask.secondTaskMethod;

public class SecondTask {
    public static void main(String[] args) {
        forMethod();
        doWhile();
        foreach();
    }

    //#2 task
    /*У вас есть int arr[]={4,9,15,7};
    Необходимо распечатать содержимое array c помощью do/while и for, for each*/

    //for
    public static void forMethod() {
        int[] numbers = {4, 9, 15, 7};
        for (int x = 0; x < numbers.length; x++) {
            System.out.print(numbers[x]);
            System.out.print(" ");
        }
        System.out.println();
    }

    //doWhile
    public static void doWhile() {
        int[] numbers = {4, 9, 15, 7};
        int i = 0;
        do {
            System.out.print(numbers[i] + " ");
            i++;
        } while (i <= numbers.length - 1);
        System.out.println();
    }

    //foreach
    public static void foreach() {
        int[] x = {4, 9, 15, 7};
        for (int i : x) {
            System.out.print(i + " ");
        }
    }
}