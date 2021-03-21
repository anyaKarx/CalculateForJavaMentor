package calculate;
abstract class Arithmetic { public abstract int apply(int lhs, int rhs); }

class Add extends Arithmetic {
    @Override
    public int apply(int lhs, int rhs)
    {
        return lhs+rhs;
    }
}
class Subtract extends Arithmetic {
    @Override
    public int apply(int lhs, int rhs)
    {
        return lhs-rhs;
    }
}
class Multiply extends Arithmetic {
    @Override
    public int apply(int lhs, int rhs)
    {
        return lhs*rhs;
    }
}
class Divide extends Arithmetic {
    @Override
    public int apply(int lhs, int rhs) throws ArithmeticException
    {
        return lhs/rhs;
    }
}
