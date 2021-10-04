package example3;

import java.util.Scanner;

public class Main {

    private static AbstractCalculator rationalcalc;
    private static AbstractCalculator vectorcalc;
    private static AbstractCalculator complexcalc;

    public static void main(String[] args) {

        rationalcalc.add = (Number a, Number b) -> {
            Number result = new Number();
            result.setA((a.getA() * b.getB()) + (a.getB() * b.getA()));
            result.setB(a.getB() * b.getB());
            return result;
        };

        rationalcalc.subtract = (Number a, Number b) -> {
            Number result = new Number();
            result.setA((a.getA() * b.getB()) - (a.getB() * b.getA()));
            result.setB(a.getB() * b.getB());
            return result;
        };

        rationalcalc.multiply = (Number a, Number b) -> {
            Number result = new Number();
            result.setA(a.getA() * b.getA());
            result.setB(a.getB() * b.getB());
            return result;
        };

        rationalcalc.divide = (Number a, Number b) -> {
            Number result = new Number();
            result.setA(a.getA() * b.getB());
            result.setB(a.getB() * b.getA());
            return result;
        };

        vectorcalc.add = (Number a, Number b) -> {
            Number result = new Number();
            result.setA(a.getA() + b.getA());
            result.setB(a.getB() + b.getB());
            return result;
        };

        vectorcalc.subtract = (Number a, Number b) -> {
            Number result = new Number();
            result.setA(a.getA() - b.getA());
            result.setB(a.getB() - b.getB());
            return result;
        };

        vectorcalc.multiply = (Number a, Number b) -> {
            Number result = new Number();
            result.setA(a.getA() * b.getA());
            result.setB(a.getB() * b.getB());
            return result;
        };

        vectorcalc.divide = (Number a, Number b) -> {
            Number result = new Number();
            result.setA(a.getA() / b.getA());
            result.setB(a.getB() / b.getB());
            return result;
        };

        complexcalc.add = (Number a, Number b) -> {
            Number result = new Number();
            result.setA(a.getA() + b.getA());
            result.setB(a.getB() + b.getB());
            return result;
        };

        complexcalc.subtract = (Number a, Number b) -> {
            Number result = new Number();
            result.setA(a.getA() - b.getA());
            result.setB(a.getB() - b.getB());
            return result;
        };

        complexcalc.multiply = (Number a, Number b) -> {
            Number result = new Number();
            result.setA((a.getA() * b.getA()) - (a.getB() * b.getB()));
            result.setB((a.getA() * b.getB()) + (a.getB() * b.getA()));
            return result;
        };

        complexcalc.divide = (Number a, Number b) -> {
            Number result = new Number();
            result.setA((a.getA() * b.getA()) + (a.getB() * b.getB()));
            result.setB((a.getA() * b.getB()) - (a.getB() * b.getA()));
            return result;
        };

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
                do {
                    System.out.print("Enter number x a> ");
                    int numberxa = s.nextInt();
                    System.out.print("Enter number x b> ");
                    int numberxb = s.nextInt();
                    System.out.print("Enter number x a> ");
                    int numberya = s.nextInt();
                    System.out.print("Enter number x b> ");
                    int numberyb = s.nextInt();
                    System.out.println("Choose operation:\n" +
                            "1 - add\n" +
                            "2 - subtract\n" +
                            "3 - multiply\n" +
                            "4 - divide\n" +
                            "5 - enter numbers again");
                    System.out.print("> ");
                    operation = s.nextInt();
                } while (operation == 5);

                System.out.println("----------------");

                switch (userInput) {
                    case 1:

                    default:

                }
            }
        }
    }
}
