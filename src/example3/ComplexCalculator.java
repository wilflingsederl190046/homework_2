package example3;

public class ComplexCalculator extends AbstractCalculator {

    public ComplexCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) {
        Number result = new Number();
        result.setA(a.getA() + b.getA());
        result.setB(a.getB() + b.getB());
        return result;

    }

    @Override
    public Number subtract(Number a, Number b) {
        Number result = new Number();
        result.setA(a.getA() - b.getA());
        result.setB(a.getB() - b.getB());
        return result;
    }

    @Override
    public Number multiply(Number a, Number b) {
        Number result = new Number();
        result.setA((a.getA() * b.getA()) - (a.getB() * b.getB()));
        result.setB((a.getA() * b.getB()) + (a.getB() * b.getA()));
        return result;
    }

    @Override
    public Number divide(Number a, Number b) {
        return null;
    }
}
