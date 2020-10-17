package com.company;

public class Operation {
    public String[] getOperands(String lineStatement) throws WrongStructureException {
        String[] operations = {"+", "-", "*", "/"};

        String currentOperation = "none";
        for (String op : operations){
            if (lineStatement.matches(".*[" + op + "].*")) {
                currentOperation = op;
                break;
            }
        }

        if (currentOperation == "none") {
            throw new WrongStructureException();
        }


        String[] splitResult;
        splitResult  = lineStatement.split("\\+|\\-|\\*|\\/");
        String[] operands = new String[3];
        operands[0] = splitResult[0];
        operands[1] = currentOperation;
        operands[2] = splitResult[1];

        return operands;
    }

    public boolean checkIfArabic(String possibleArabic){
        boolean isArabic = false;
        String regex = "[1-9]|10";
        if (possibleArabic.matches(regex)) {
            isArabic = true;
        } else {
            isArabic = false;
        }
        return isArabic;
    }

    public boolean checkIfRoman(String possibleRoman){
        boolean isRoman = false;
        String regex = "I|II|III|IV|V|VI|VII|VIII|IX|X";
        if (possibleRoman.matches(regex)) {
            isRoman = true;
        } else {
            isRoman = false;
        }
        return isRoman;
    }
}

