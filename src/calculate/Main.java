package calculate;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args)
    {
        String arithmeticExpressions = inputValidation.customInput();
        String s = arithmeticExpressions.replaceAll("\\s", "");
        String[] subString= s.split("(?<=[+/*-]|(?=[+/*-]))");
        if (RegexMatches.getMatchArabic(arithmeticExpressions)) {
            int a = parseInt(subString[0]);
            String command = subString[1];
            int b = parseInt(subString[2]);
            System.out.println(Calculate.GetResult(a,b,command));
        } else{
            int a = ConverterRomanNumerals.romanToArabic(subString[0]);
            String command = subString[1];
            int b = ConverterRomanNumerals.romanToArabic(subString[2]);
            System.out.println(ConverterRomanNumerals.arabicToRoman(Calculate.GetResult(a,b,command)));
        }
    }
}
