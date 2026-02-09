package lab5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

import static lab5.Censored.censore;
import static lab5.IsPalindrom.ispalindrom;
import static lab5.LongerWordFinder.lWordFinder;
import static lab5.ReverseText.reverseText;
import static lab5.SubStrCounter.subStrCounter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Задание 1" + "\n");
        System.out.println("Введите текст (разделяйте слова только пробелами)");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String lWord = lWordFinder(text);
        System.out.println("Самое длинное слово: " + lWord);


        System.out.println("\n" + "Задание 2" + "\n");
        System.out.println("Введите 1 слово для проверки на палиндром");
        String wordPal = scan.nextLine();
        System.out.println("Является ли слово " + wordPal + " палиндромом?" + "\n" + "Ответ:" + ispalindrom(wordPal));

        System.out.println("\n" + "Задание 3" + "\n");
        System.out.println("Введите текст, который нужно цензурировать");
        String censText = scan.nextLine();
        System.out.println("Введите слово, которое нужно цензурировать");
        String censoringWord = scan.nextLine();
        System.out.println("Введите что будет выводиться вместо цензурированного слова");
        String censoredWord = scan.nextLine();
        System.out.println(censore(censText, censoringWord, censoredWord));


        System.out.println("\n" + "Задание 4" + "\n");
        System.out.println("Введите 1 строку");
        String fStr = scan.nextLine();
        System.out.println("Введите 2 строку");
        String secStr = scan.nextLine();
        System.out.println(subStrCounter(fStr, secStr));

        System.out.println("\n" + "Задание 5" + "\n");
        System.out.println("Введите текст (разделяйте слова только пробелами)");
        String revStr = scan.nextLine();
        System.out.println(reverseText(revStr));


    }
}