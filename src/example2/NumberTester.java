package example2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class NumberTester {

    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    private ArrayList<String> numbers;

    public NumberTester(String fileName) {
        numbers = new ArrayList<>();
        try (final BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null)
            {
                numbers.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        oddTester = (number) -> (number % 2) != 0;

        primeTester = (number) -> {
            boolean[] isPrim = new boolean[number+1];

            for (int i = 0; i < isPrim.length; i++) {
                if(i % 2 != 0) {
                    isPrim[i] = true;
                }
            }

            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if(isPrim[i]) {
                    for(int y = i; y <= number / i; y++) {
                        int multipleNumber = i * y;
                        if(multipleNumber < number) {
                            isPrim[multipleNumber] = false;
                        }
                    }
                }
            }

            int counter = 0;
            for(int i = 0; i < isPrim.length; i++) {
                if(isPrim[i]) {
                    counter++;
                }
            }

            int[] allPrimes = new int[counter];
            int indexForPrim = 0;
            for(int i = 0; i < isPrim.length; i++) {
                if(isPrim[i]) {
                    allPrimes[indexForPrim++] = i;
                }
            }
            allPrimes[0] = 2;

            for(int i = 0; i < allPrimes.length; i++) {
                if(allPrimes[i] == number) {
                    return true;
                }
            }
            return false;
        };


        palindromeTester = (number) -> {
            String numberString = Integer.toString(number);
            String result = "";
            for(int i = numberString.length()-1; i >= 0; i--) {
                result += numberString.charAt(i);
            }
            return numberString.equals(result);
        };
    }

    public void setOddEventTester(NumberTest oddTester) {
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() {
        int counter = Integer.parseInt(numbers.get(0));
        if(counter != (numbers.size() - 1)) {
            throw new IllegalArgumentException("The first number in your file isn't correct! ");
        }

        for(int i = 1; i <= counter; i++) {
            String lineString = numbers.get(i);
            String[] parts = lineString.split(" ");

            boolean isNumeric =  parts[0].matches("[+-]?\\d*(\\.\\d+)?");
            boolean isNumeric2 = parts[1].matches("[+-]?\\d*(\\.\\d+)?");

            if(isNumeric == false || isNumeric2 == false) {
                throw new IllegalArgumentException("There can only be numbers in the file!");
            }

            int number = Integer.parseInt(parts[1]);
            switch (parts[0]) {
                case "1":
                    boolean isOdd = oddTester.testNumber(number);
                    if(isOdd) {
                        System.out.println("ODD");
                    } else {
                        System.out.println("EVEN");
                    }
                    break;
                case "2":
                    boolean isPrime = primeTester.testNumber(number);
                    if(isPrime) {
                        System.out.println("PRIME");
                    } else {
                        System.out.println("NO PRIME");
                    }
                    break;
                case "3":
                    boolean isPalindrome = palindromeTester.testNumber(number);
                    if(isPalindrome) {
                        System.out.println("PALINDROME");
                    } else {
                        System.out.println("NO PALINDROME");
                    }
                    break;
                default:
                    throw new IllegalArgumentException("There can only be 1, 2 or 3 as first number in your file!");
            }
        }
    }
}
