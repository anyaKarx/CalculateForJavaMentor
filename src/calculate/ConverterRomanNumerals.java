package calculate;

import java.util.List;

public class ConverterRomanNumerals {
    public static int romanToArabic(String input) {
        String romanNumeral = input;
        int result = 0;

        List<RomanSymbols> romanNumerals = RomanSymbols.getReverseSortedValues();

        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomanSymbols symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.GetValue();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }
        if (romanNumeral.length() > 0) {
            throw new IllegalArgumentException(input + " конвертация в римские цифры невозможна");
        }

        return result;
    }

    public static String arabicToRoman(int number) {
        if (number <= 0) throw new IllegalArgumentException("Вы получили результат, который, к сожалению," +
                " в римском счислении неотобразить.");
        List<RomanSymbols> romanNumerals = RomanSymbols.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (number > 0 && i < romanNumerals.size()) {
            RomanSymbols currentSymbol = romanNumerals.get(i);
            if (currentSymbol.GetValue() <= number){
                sb.append(currentSymbol.name());
                number -= currentSymbol.GetValue();
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}