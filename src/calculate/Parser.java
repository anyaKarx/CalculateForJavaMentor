package calculate;

public class Parser {
    static String[] Parse(String expression) {
        String[] result = new String[3];

        String s = expression.replaceAll("\\s", "");
        return result = s.split("(?<=[+/*-]|(?=[+/*-]))");
    }
}
