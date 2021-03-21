package calculate;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Пожалуйста, введите выражение вида: число арифмитическая операция число." +
                "\nПримеры: a + b, a - b, a * b, a / b \nОбратите внимание, " +
                "что калькулятор работает с числами от 0 до 10 или римскими от I до X.)");
        String expression = (new Scanner(System.in).nextLine());

        Validator validator = new ArabAndRomeExpressionValidator();
        try
        {
            validator.Validate(expression);
        } catch (Exception e) {System.out.println(e.getMessage()); return;}

        boolean is_arabic = RegexMatches.isMatchArabicExp(expression);

        String[] tokens;
        tokens = Parser.Parse(expression);
        String command = tokens[1];
        int lhs;
        int rhs;
        int result ;
        if (is_arabic) {
            lhs = parseInt(tokens[0]);
            rhs = parseInt(tokens[2]);
        } else {
            try
            {
                lhs = ConverterRomanNumerals.romanToArabic(tokens[0]);
                rhs = ConverterRomanNumerals.romanToArabic(tokens[2]);
            }
            catch(Exception e){System.out.println(e.getMessage());return; }
        }

        try{
            result = Calculate.GetResult(lhs, rhs, command);
        }catch (Exception e){
            e.getMessage();
            return;
        }
        if (is_arabic) {
            System.out.println(result);
        } else {
            try{
                System.out.println(ConverterRomanNumerals.arabicToRoman(result));
            }catch(Exception e){System.out.println(e.getMessage());}
        }

    }
}
