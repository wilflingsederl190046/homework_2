package example3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CalculationOperation rationalAdd = (Number a, Number b) -> {
            Number result = new Number();
            result.setA((a.getA() * b.getB()) + (a.getB() * b.getA()));
            result.setB(a.getB() * b.getB());
            return result;
        };

        CalculationOperation rationalSubtract = (Number a, Number b) -> {
            Number result = new Number();
            result.setA((a.getA() * b.getB()) - (a.getB() * b.getA()));
            result.setB(a.getB() * b.getB());
            return result;
        };

        CalculationOperation rationalMultiply = (Number a, Number b) -> {
            Number result = new Number();
            result.setA(a.getA() * b.getA());
            result.setB(a.getB() * b.getB());
            return result;
        };

        CalculationOperation rationalDivide = (Number a, Number b) -> {
            Number result = new Number();
            result.setA(a.getA() * b.getB());
            result.setB(a.getB() * b.getA());
            return result;
        };

        RationalCalculator rc = new RationalCalculator(rationalAdd, rationalSubtract, rationalMultiply, rationalDivide);

        CalculationOperation vectorAdd = (Number a, Number b) -> {
            Number result = new Number();
            result.setA(a.getA() + b.getA());
            result.setB(a.getB() + b.getB());
            return result;
        };

        CalculationOperation vectorSubtract = (Number a, Number b) -> {
            Number result = new Number();
            result.setA(a.getA() - b.getA());
            result.setB(a.getB() - b.getB());
            return result;
        };

        CalculationOperation vectorMultiply = (Number a, Number b) -> {
            Number result = new Number();
            result.setA(a.getA() * b.getA());
            result.setB(a.getB() * b.getB());
            return result;
        };

        CalculationOperation vectorDivide = (Number a, Number b) -> {
            Number result = new Number();
            result.setA(a.getA() / b.getA());
            result.setB(a.getB() / b.getB());
            return result;
        };

        VectorCalculator vc = new VectorCalculator(vectorAdd, vectorSubtract, vectorMultiply, vectorDivide);

        CalculationOperation complexAdd = (Number a, Number b) -> {
            Number result = new Number();
            result.setA(a.getA() + b.getA());
            result.setB(a.getB() + b.getB());
            return result;
        };

        CalculationOperation complexSubtract = (Number a, Number b) -> {
            Number result = new Number();
            result.setA(a.getA() - b.getA());
            result.setB(a.getB() - b.getB());
            return result;
        };

        CalculationOperation complexMultiply = (Number a, Number b) -> {
            Number result = new Number();
            result.setA((a.getA() * b.getA()) - (a.getB() * b.getB()));
            result.setB((a.getA() * b.getB()) + (a.getB() * b.getA()));
            return result;
        };

        CalculationOperation complexDivide = (Number a, Number b) -> {
            Number result = new Number();
            result.setA((a.getA() * b.getA()) + (a.getB() * b.getB()));
            result.setB((a.getA() * b.getB()) - (a.getB() * b.getA()));
            return result;
        };

        ComplexCalculator cc = new ComplexCalculator(complexAdd, complexSubtract, complexMultiply, complexDivide);

        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("Choose calculator:\n" +
                    " 1 - Relational calculator\n" +
                    " 2 - Vector calculator\n" +
                    " 3 - Complex calculator\n" +
                    " 4 - Exit program");
            System.out.print("> ");
            int userInput = s.nextInt();

            if(userInput == 4) {
                System.exit(0);
            } else if(userInput != 1 && userInput != 2 && userInput != 3) {
                System.out.println("Please enter only numbers from 1 to 4 and try again!\n");
            } else {
                int operation = 0;
                double numberxa = 0;
                double numberxb = 0;
                double numberya = 0;
                double numberyb = 0;
                do {
                    System.out.print("Enter number x a> ");
                    numberxa = s.nextInt();
                    System.out.print("Enter number x b> ");
                    numberxb = s.nextInt();
                    System.out.print("Enter number x a> ");
                    numberya = s.nextInt();
                    System.out.print("Enter number x b> ");
                    numberyb = s.nextInt();
                    System.out.println("Choose operation:\n" +
                            "1 - add\n" +
                            "2 - subtract\n" +
                            "3 - multiply\n" +
                            "4 - divide\n" +
                            "5 - enter numbers again");
                    System.out.print("> ");
                    operation = s.nextInt();
                } while (operation == 5);

                Number number1 = new Number();
                number1.setA(numberxa);
                number1.setB(numberxb);

                Number number2 = new Number();
                number2.setA(numberya);
                number2.setB(numberyb);

                Number result = null;
                switch (userInput) {
                    case 1:
                        if(operation == 1) {
                            result  = rc.add(number1, number2);
                        } else if(operation == 2) {
                            result  = rc.subtract(number1, number2);
                        } else if(operation == 3) {
                            result  = rc.multiply(number1, number2);
                        }  else if(operation == 4) {
                            result  = rc.divide(number1, number2);
                        } else {
                            throw new IllegalArgumentException("Only Enter Number from 1 to 5!");
                        }
                        break;
                    case 2:
                        if(operation == 1) {
                            result  = vc.add(number1, number2);
                        } else if(operation == 2) {
                            result  = vc.subtract(number1, number2);
                        } else if(operation == 3) {
                            result  = vc.multiply(number1, number2);
                        }  else if(operation == 4) {
                            result  = vc.divide(number1, number2);
                        } else {
                            throw new IllegalArgumentException("Only Enter Number from 1 to 5!");
                        }
                        break;
                    case 3:
                        if(operation == 1) {
                            result  = cc.add(number1, number2);
                        } else if(operation == 2) {
                            result  = cc.subtract(number1, number2);
                        } else if(operation == 3) {
                            result  = cc.multiply(number1, number2);
                        }  else if(operation == 4) {
                            result  = cc.divide(number1, number2);
                        } else {
                            throw new IllegalArgumentException("Only Enter Number from 1 to 5!");
                        }
                }

                System.out.println("--------------\n" +
                        "Solution:\n" +
                        "a = " + result.getA() + "\n" +
                        "b = " + result.getB() + "\n" +
                        "--------------");
            }
        }
    }
}
