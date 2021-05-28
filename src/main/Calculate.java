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

    public Calculate(String firstNumber, String secondNumber, String operator) throws Exception {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;
        type = "a";
        result = calculate(leadToArab(firstNumber), leadToArab(secondNumber), operator);
    }

    private Integer leadToArab(String number) throws Exception {

        Integer numberInt;

        if (number.matches("[IVX]+")){
            type = "r";
            RomanToArab romanToArab = new RomanToArab(number);
            return romanToArab.getValue();
        }
        numberInt = Integer.parseInt(number);
        if(numberInt > 0 && numberInt <=10){
            return Integer.parseInt(number);
        } else {
            throw new Exception("Элементы введены неправильно");
        }
    }

    public String getResult() {
        return result;
    }

    public String getType() {
        return type;
    }

    public String calculate(Integer firstNumber, Integer secondNumber, String operator) {
        int result;
        if(operator.equals("+")){
            result = (firstNumber + secondNumber);
        }
        else if(operator.equals("-")){
            result = (firstNumber - secondNumber);
        }
        else if(operator.equals("/")){
            result = (firstNumber / secondNumber);
        }
        else {
            result = (firstNumber * secondNumber);
        }
        if (type.equals("r")){
            ArabToRoman arabToRoman = new ArabToRoman(result);
            return arabToRoman.getNumber();
        }
        return String.valueOf(result);
    }


}
