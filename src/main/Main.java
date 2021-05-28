package main;

import java.util.Scanner;

/**
 * Created by timurg on 27.05.2021.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b.\n Данные необходимо вводить в одну строку (смотрите пример)!\n" +
                "Калькулятор умеет работать как с арабскими (1,2,3,4,5…), так и с римскими (I,II,III,IV,V…) числами от 1 до 10 включительно, не более.\n" +
                "Калькулятор умеет работать только с целыми числами.\n\n" +
                "Пример ввода:\n" +
                "1 + 2\n" +
                "VI / III");

        while (true) {
            System.out.println("Введите выражение: ");
            String expression = scanner.nextLine();

            String[] elementsExpr = сheckExpression(expression);

            Calculate calculate = new Calculate(elementsExpr[0], elementsExpr[2], elementsExpr[1]);

            System.out.println(calculate.getResult());



            if (expression.equals("exit")) {
                break;
            }

        }

        scanner.close();

    }

    public static String[] сheckExpression(String expression) throws Exception {
        String[] elementsExpr = expression.split("\\s");
        if (elementsExpr.length != 3){
            throw new Exception("Ошибка ввода выражения");
        }
        else if(!elementsExpr[1].matches("[+*/-]")){
            throw new Exception("Оператор введен не верно");
        }
        else if (elementsExpr[0].matches("[0-9]+") && elementsExpr[2].matches("[0-9]+") ||
                elementsExpr[0].matches("[IVX]+") && elementsExpr[2].matches("[IVX]+")){
            return elementsExpr;

        }else {
            throw new Exception("Элементы введены неправильно");

        }
    }
}
