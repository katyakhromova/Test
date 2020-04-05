package src;

import static src.FirstTask.fourthTaskMethod;

public class FourthTask {

    //#5 task

    /*Создать array  размер которого 4. Добавить в него 4 любых фрукта. Вывести название фруктов через for each, а также вычислить размер массива и вывести его тоже.
    После этого вывести фрукты в обратном порядке через do/while.
    */
    public static void main(String[] args) {

        String[] arr = new String[4];

        arr[0] = "apple";
        arr[1] = "pineapple";
        arr[2] = "cherry";
        arr[3] = "strawberry";

        forEach(arr);
        doWhile(arr);
    }

    public static void forEach(String[] fruit) {
        for (String i : fruit) {
            System.out.println(i);
        }
        System.out.println("Длина массива: " + fruit.length);
    }

    //doWhile

    public static void doWhile(String[] secondFruit) {
        int i = secondFruit.length;
        do {
            i--;
            System.out.println(secondFruit[i]);
        } while (i > 0);
    }
}
