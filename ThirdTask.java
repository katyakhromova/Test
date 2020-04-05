package src;

import static src.FirstTask.thirdTaskMethod;

public class ThirdTask {

    //#4 task
    /*Если вы достигли 18 лет, вы можете голосовать, если нет, то не можете.
    Сделать через тернарный оператор*/

    public static void main(String[] args) {
        age(18);
    }

    public static void age(int a) {
        String securityAnswer;
        if (a >= 18) {
            securityAnswer = "Вы можете голосовать!";
        } else {
            securityAnswer = "Вы еще не можете голосовать!";
        }

        System.out.println(securityAnswer);
    }
}
