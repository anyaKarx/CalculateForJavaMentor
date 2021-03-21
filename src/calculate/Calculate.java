package calculate;

import java.util.HashMap;
import java.util.Map;

public class Calculate{
    private static Map<String, Arithmetic> operators = new HashMap<String, Arithmetic>()
    {{
        put("+", new Add());
        put("-", new Subtract());
        put("*", new Multiply());
        put("/", new Divide());
    }};

    public static int GetResult(int lhs, int rhs, String command)
    {
        return operators.get(command).apply(lhs,rhs);
    }

}
