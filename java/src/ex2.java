/*
Задача 2: Определение конечного состояния лайков(10баллов)

Напишите программу, которая анализирует список действий пользователя с кнопками "Like" и "Dislike"
на YouTube и возвращает конечное состояние в виде одного из трех возможных результатов:
"Dislike", "Like" или "Nothing", если ни одно действие не было совершено или последнее
действие было отменено.

Условия:

- Нажатие на активную кнопку отменяет действие.
- Переключение с "Нравится" на "Не нравится" (и наоборот) меняет состояние.
- Пустой список возвращает "Ничего".

Данные для тестов:

1. Ввод: [Dislike] ➞ Вывод: "Dislike"
2. Ввод: [Like, Like] ➞ Вывод: "Nothing"
3. Ввод: [Dislike, Like] ➞ Вывод: "Like"
4. Ввод: [Like, Dislike, Dislike] ➞ Вывод: "Nothing"
5. ["Like", "Dislike", "Like"] ➞ "Нравится"
6. ["Dislike", "Dislike"] ➞ "Ничего"
7. ["Like", "Dislike", "Dislike", "Like", "Like"] ➞ "Ничего"
8. ["Dislike", "Like", "Dislike", "Like", "Dislike"] ➞ "Не нравится"
9. [] ➞ "Ничего"
10. ["Like"] ➞ "Нравится"
11. ["Dislike", "Like", "Like", "Dislike", "Dislike"] ➞ "Ничего"
*/

import java.util.*;


public class ex2 {
    public static String determineFinalState(List<String> actions) {
        if (actions.isEmpty()) return "Nothing";

        int likesCount = 0;
        int dislikesCount = 0;

        for (String action : actions) {
            if (action.equals("Like")) {
                likesCount++;
            } else if (action.equals("Dislike")) {
                dislikesCount++;
            }
        }

        if (likesCount > dislikesCount) {
            return "Like";
        } else if (dislikesCount > likesCount) {
            return "Dislike";
        } else {
            return "Nothing";
        }
    }

    public static void main(String[] args) {
        List<String> test1 = List.of("Dislike");
        List<String> test3 = List.of("Dislike", "Dislike");
        List<String> test4 = List.of("Like", "Dislike", "Dislike");
        List<String> test5 = List.of("Like", "Dislike");
        List<String> test2 = List.of("Like", "Dislike", "Like");

        System.out.println("Ввод: " + test1 + " ➞ Вывод: " + determineFinalState(test1));
        System.out.println("Ввод: " + test2 + " ➞ Вывод: " + determineFinalState(test2));
        System.out.println("Ввод: " + test3 + " ➞ Вывод: " + determineFinalState(test3));
        System.out.println("Ввод: " + test4 + " ➞ Вывод: " + determineFinalState(test4));
        System.out.println("Ввод: " + test5 + " ➞ Вывод: " + determineFinalState(test5));
    }
}
