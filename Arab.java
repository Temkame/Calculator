package Сalculator;

public class Arab {
    public static int calculate(int num1, int num2, String s) {
        int result = switch (s) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> throw new IllegalArgumentException("Incorrect operation sign");
        };
        return result;
    }
}

