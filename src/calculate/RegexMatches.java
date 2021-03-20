package calculate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {
    private static final String patternArabic = "^([0-9]|10)\\s?[+/*-]{1}\\s?([0-9]|10)$";
    private static final String patternRoman = "^(X|IX|IV|V?I{0,3})\\s?[+/*-]{1}\\s?(X|IX|IV|V?I{0,3})$";
    final static Pattern arabic = Pattern.compile(patternArabic);
    final static Pattern Roman = Pattern.compile(patternRoman);

    public static boolean getMatchArabic(String input)
    {
        Matcher arabicValue = arabic.matcher(input);
        return (arabicValue.matches());
    }

    public static boolean getMatchRoman(String input)
    {
        Matcher romanValue = Roman.matcher(input);
        return (romanValue.matches());
    }
}

