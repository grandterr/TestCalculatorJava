package com.company;

public class RomanHandler {
    public String convertArabicToRoman(int arabicNumb){
        String theRomanNumeral = "";
        if(arabicNumb > 10){
            int tens = arabicNumb/10;
            int ones = arabicNumb%10;
            theRomanNumeral = arabicTensToRoman(tens) + arabicOnesToRoman(ones);
        } else if (arabicNumb <= 10){
            theRomanNumeral = arabicOnesToRoman(arabicNumb);
        }
        if (arabicNumb == 0){
            theRomanNumeral = "0";
            System.out.println("The roman numerals don't have a numeral for zero.");
        }
        return theRomanNumeral;
    }

    public String arabicTensToRoman(int arabicNumber) {
        String foundRoman = "";
        switch (arabicNumber) {
            case 1:
                foundRoman = "X";
                break;
            case 2:
                foundRoman = "XX";
                break;
            case 3:
                foundRoman = "XXX";
                break;
            case 4:
                foundRoman = "XL";
                break;
            case 5:
                foundRoman = "L";
                break;
            case 6:
                foundRoman = "LX";
                break;
            case 7:
                foundRoman = "LXX";
                break;
            case 8:
                foundRoman = "LXXX";
                break;
            case 9:
                foundRoman = "XC";
                break;
            case 10:
                foundRoman = "C";
                break;
        }

        return foundRoman;
    }

    public String arabicOnesToRoman(int arabicNumber) {
        String foundRoman = "";
        switch (arabicNumber) {
            case 1:
                foundRoman = "I";
                break;
            case 2:
                foundRoman = "II";
                break;
            case 3:
                foundRoman = "III";
                break;
            case 4:
                foundRoman = "IV";
                break;
            case 5:
                foundRoman = "V";
                break;
            case 6:
                foundRoman = "VI";
                break;
            case 7:
                foundRoman = "VII";
                break;
            case 8:
                foundRoman = "VIII";
                break;
            case 9:
                foundRoman = "IX";
                break;
        }

        return foundRoman;
    }
}
