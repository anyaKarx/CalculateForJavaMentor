package calculate;

public abstract class Validator extends RegexMatches {
    public abstract void Validate(String validateMe) throws Exception;
}
class ArabAndRomeExpressionValidator extends Validator {
    @Override
    public void Validate (String validateMe) throws Exception {
        if (!(isMatchRomanExp(validateMe) || isMatchArabicExp(validateMe))) {
            throw new IllegalArgumentException(" Введенные данные не верны.");
        }
    }
}

