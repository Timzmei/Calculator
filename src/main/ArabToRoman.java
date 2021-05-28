package main;

/**
 * Created by timurg on 28.05.2021.
 */
public class ArabToRoman {
    
    public String numberString;

    String[] arab = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C"};
    Integer[] rome = {1, 4, 5, 9, 10, 40, 50, 90, 100};

    public ArabToRoman(Integer number) {
        this.numberString = checkNumber(number);
    }

    private String checkNumber(Integer number) {
        String romeNumber = "";
        int i = rome.length - 1;
        while (number > 0){
            if(number - rome[i] < 0){
                i--;
            }else {
                number = number - rome[i];
                romeNumber = romeNumber + arab[i];
            }
        }
        
        return romeNumber;
    }

    public String getNumber() {
        return numberString;
    }
}
