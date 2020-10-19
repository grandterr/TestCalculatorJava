package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to arabic/roman calculator. \nWrite \"end\" to close the calculator.");

        String userCommand;
        Operation operation = new Operation();
        ArabicNumberHandler arabicNumberHandler = new ArabicNumberHandler();
        RomanHandler romanHandler = new RomanHandler();
        String[] operands = new String[3];
        int result = 0;
        String romanResult = "";

        String currentOperation;
        String leftPart;
        String rightPart;
        boolean isNegative = false;

        while(true) {
            userCommand = userInput.nextLine();
            if (userCommand.equals("end")) {
                System.out.println("Thanks for using the calculator!");
                break;
            }
            userCommand = userCommand.trim();

            try {
                operands = operation.getOperands(userCommand);
            } catch (WrongStructureException e) {
                System.out.println(e);
                break;
            }

            currentOperation = operands[1];
            leftPart = operands[0].trim();
            rightPart = operands[2].trim();

            try {
                if (operation.checkIfArabic(leftPart) && operation.checkIfArabic(rightPart)) {
                    result = arabicNumberHandler.doOperation(leftPart, rightPart, currentOperation);
                    System.out.println(result);
                } else if (operation.checkIfRoman(leftPart) && operation.checkIfRoman(rightPart)) {
                    RomanNumeral romanNumeralLeft = RomanNumeral.valueOf(leftPart);
                    RomanNumeral romanNumeralRight = RomanNumeral.valueOf(rightPart);
                    leftPart = romanNumeralLeft.getRomanNumeral();
                    rightPart = romanNumeralRight.getRomanNumeral();
                    result = arabicNumberHandler.doOperation(leftPart, rightPart, currentOperation);

                    if (result >= 0) {
                        isNegative = false;
                        romanResult = romanHandler.convertArabicToRoman(result, isNegative);
                        System.out.println(romanResult);
                    } else if (result < 0) {
                        isNegative = true;
                        romanResult = romanHandler.convertArabicToRoman(result, isNegative);
                        System.out.println("-" + romanResult);
                    }

                } else {
                    throw new WrongNumberException();
                }
            } catch (WrongNumberException wrongNumber) {
                System.out.println(wrongNumber);
                break;
            }


        }
        }
}
