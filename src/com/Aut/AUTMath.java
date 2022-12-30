package com.Aut;

public class AUTMath {
    /**
     * gets two integers and returns their sum.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return int
     */
    public static int sum(int num1, int num2) {
        return num1+num2;
    }


    /**
     * gets two integer and returns their subtraction.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return int
     */
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }


    /**
     * gets two numbers and returns their subtraction.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return int
     */
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }


    /**
     * gets two numbers and returns their division.
     *
     * @param num1 the num 1
     * @param num2 the num 2
     * @return int
     */

    public static double divide(int num1, int num2) {
        double result=num1;
        return result/num2;
    }

    /**
     * gets a number and returns its factorial.
     *
     * @param number the number
     * @return int
     */
    public static long factorial(int number) {
        int result = 1;

        for (int counter = 1; counter <= number; counter++) {
            result = multiply(result, counter);
        }
        return result;
    }


}
