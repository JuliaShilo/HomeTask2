package org.itstep;

public class ApplicationRunner {

    public static void main(String[] args) {

        int resultByDiv = getSumByDiv(12345);
        System.out.println(resultByDiv);

        int resultByStrManipulation = getResultByStrManipulatrion(12345);
        System.out.println(resultByStrManipulation);

    }

    public static int getResultByStrManipulatrion(int number) {

        int result = 0;

        String numberAsString = String.valueOf(number);
        char [] symbols = numberAsString.toCharArray();

        for (int i = 0; i<symbols.length; i++) {
            result += Character.getNumericValue(symbols [i]);
        }

        for (char symbol : symbols) {
            result += Character.getNumericValue(symbol);
        }
        return result;
    }

    public static int getSumByDiv(int number) {

        int result = 0;
        while (number !=0) {
            result += number%10;
            number = number/10;
        }
        return result;
    }

}
