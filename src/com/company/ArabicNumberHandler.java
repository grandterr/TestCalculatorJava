package com.company;

public class ArabicNumberHandler {
    public int doOperation(String leftPart, String rightPart, String operation){
        int result = 0;
        int leftInt = Integer.parseInt(leftPart);
        int rightInt =  Integer.parseInt(rightPart);
        switch (operation){
            case "+":
                result = sum(leftInt, rightInt);
                break;
            case "-":
                result = subtract(leftInt, rightInt);
                break;
            case "*":
                result = multiply(leftInt, rightInt);
                break;
            case "/":
                result = divide(leftInt, rightInt);
                break;
        }
        return result;
    }

    public static int divide(int a, int b){
        return a/b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }
}
