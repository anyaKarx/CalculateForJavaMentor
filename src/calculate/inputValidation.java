package calculate;
import java.util.Scanner;

public class inputValidation {
    static public String customInput() {
        String customInput;
        System.out.println("Пожалуйста, введите выражение вида: число арифмитическая операция число." +
                "\nПримеры: a + b, a - b, a * b, a / b \nОбратите внимание, " +
                "что калькулятор работает с числами от 0 до 10 или римскими от I до X.)");
        Scanner scan = new Scanner(System.in);
        customInput = scan.nextLine();
        scan.close();
        if (!(RegexMatches.getMatchRoman(customInput)||RegexMatches.getMatchArabic(customInput))) {
                throw new IllegalArgumentException(" Введенные данные не верны.");
        } else return customInput;
    }
}
