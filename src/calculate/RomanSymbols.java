package calculate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum RomanSymbols {
    I("I",1),
    IV("IV",4),
    V("V",5),
    IX("IX", 9),
    X("X", 10),
    L("L", 50),
    C("C",100);

    private final int value;
    private final String key;
    RomanSymbols(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public int GetValue(){
        return value;
    }
    public String GetRomanNumber(){
        return key;
    }
    public static List<RomanSymbols> getReverseSortedValues() {
        return Arrays.stream(values())
                .sorted(Comparator.comparing((RomanSymbols e) -> e.value).reversed())
                .collect(Collectors.toList());
    }
}
