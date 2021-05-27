package main;

/**
 * Created by timurg on 28.05.2021.
 */
public class Calculate {
    String firstNumber;
    String secondNumber;
    String operator;
    String type;
    String result;

    public Calculate(String firstNumber, String secondNumber, String operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
        type = "a";
        result = calculate(leadToArab(firstNumber), leadToArab(secondNumber), operator);
    }

    private Integer leadToArab(String number) {

        if (number.matches("[IVX]")){
            type = "r";
            RomanToArab romanToArab = new RomanToArab(number);
            return romanToArab.getValue();
        }
        return Integer.parseInt(number);
    }

    public String getResult() {
        return result;
    }

    public String calculate(Integer firstNumber, Integer secondNumber, String operator) {
        if(operator.equals("+")){
            return String.valueOf(firstNumber + secondNumber);
        }
        else if(operator.equals("-")){
            return String.valueOf(firstNumber - secondNumber);
        }
        else if(operator.equals("/")){
            return String.valueOf(firstNumber / secondNumber);
        }
        else {
            return String.valueOf(firstNumber * secondNumber);
        }
    }


}
