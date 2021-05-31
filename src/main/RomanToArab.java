package main;

import java.util.TreeMap;

/**
 * Created by timurg on 28.05.2021.
 */
public class RomanToArab {
    String number;
    Integer value;

    public RomanToArab(String number) throws Exception {
        this.number = number;
        value = setValue(number);
    }

    private Integer setValue(String number) throws Exception {
        TreeMap<String, Integer>arabNumber = new TreeMap<>();
        arabNumber.put("I", 1);
        arabNumber.put("II", 2);
        arabNumber.put("III", 3);
        arabNumber.put("IV", 4);
        arabNumber.put("V", 5);
        arabNumber.put("VI", 6);
        arabNumber.put("VII", 7);
        arabNumber.put("VIII", 8);
        arabNumber.put("IX", 9);
        arabNumber.put("X", 10);

        if(!arabNumber.containsKey(number)){
            throw new Exception("Элементы введены неправильно");
        }

        return arabNumber.get(number);

    }

    public Integer getValue() {
        return value;
    }
}
