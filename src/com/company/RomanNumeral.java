package com.company;

public enum RomanNumeral {
    I("1"), II("2"), III("3"), IV("4"), V("5"), VI("6"), VII("7"), VIII("8"), IX("9"), X("10");

    private String romanNumeral;

    public String getRomanNumeral() {
        return romanNumeral;
    }

    RomanNumeral(String romanNumeral){
        this.romanNumeral = romanNumeral;
    }

}
