package calculate;

import java.util.HashMap;
import java.util.Map;

public class Calculate {
    public static abstract class Arithmetic { public abstract int apply(int a, int b); }

    public static class Add extends Arithmetic { public int apply(int a, int b) { return a+b; } }
    public static class Subtract extends Arithmetic { public int apply(int a, int b) { return a-b; } }
    public static class Multiply extends Arithmetic { public int apply(int a, int b) { return a*b; } }
    public static class Divide extends Arithmetic { public int apply(int a, int b) { try{ return a/b; }
    catch (ArithmeticException e) { System.out.println("Error: " + e.getMessage()); };
        return 0;
    }}

    // TODO: 19.03.2021
    public final static Map<String, Arithmetic> operators() {
        Map<String, Arithmetic> operators = new HashMap<String, Arithmetic>(6);
        operators.put("+", new Add());
        operators.put("-", new Subtract());
        operators.put("*", new Multiply());
        operators.put("/", new Divide());
        return operators;
    }
    public static int GetResult(int a, int b, String command){
        return operators().get(command).apply(a,b) ;
    }

}
