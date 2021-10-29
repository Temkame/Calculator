package Сalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isRoman = false;

        Scanner scr = new Scanner(System.in);
        String str1 = scr.next();
        String operation = scr.next();
        String str2 = scr.next();

        int num1 = Roman.romanToArabic(str1);
        int num2 = Roman.romanToArabic(str2);
        if (num1 != -1 || num2 != -1) {
            isRoman = true;
        } else {

            num1 = Integer.parseInt(str1);
            num2 = Integer.parseInt(str2);
        }

        int result = Arab.calculate(num1, num2, operation);

        String answer = String.valueOf(result);

        if (isRoman) {
            answer = Roman.arabicToRoman(result);
        }
        System.out.println(answer);


    }
}
