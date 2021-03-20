package calculate;

import java.util.List;

public class ConverterRomanNumerals {
    public static int romanToArabic(String input) {
        String romanNumeral = input.toUpperCase();
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
            throw new IllegalArgumentException(input + " cannot be converted to a Roman Numeral");
        }

        return result;
    }

    public static String arabicToRoman(int number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " is not in range [1,4000]");
        }

        List<RomanSymbols> romanNumerals = RomanSymbols.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while (number > 0 && i < romanNumerals.size()) {
            RomanSymbols currentSymbol = romanNumerals.get(i);
            if (currentSymbol.GetValue() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.GetValue();
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
