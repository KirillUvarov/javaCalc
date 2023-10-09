package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.controller.interfaces.Operation;
import org.example.controller.interfaces.impl.Add;
import org.example.controller.interfaces.impl.Division;
import org.example.controller.interfaces.impl.Multi;
import org.example.controller.interfaces.impl.Subtract;
import org.example.model.ComplexNumber;
import lombok.Data;
import lombok.Getter;

import java.util.Scanner;

@Slf4j
public class Main{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вещественное первого комплексного числа: ");
        double firstReal = scanner.nextDouble();
        System.out.println("Введите мнимое первого комплексного числа: ");
        double firstImaginary = scanner.nextDouble();
        System.out.println("Введите вещественное второго комплексного числа: ");
        double secondReal = scanner.nextDouble();
        System.out.println("Введите мнимое второго комплексного числа: ");
        double secondImaginary = scanner.nextDouble();
        System.out.println("Введите операцию: ");

        String operationString = scanner.next();
        Operation operation = null;

        switch (operationString){
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Subtract();
                break;
            case "*":
                operation = new Multi();
                break;
            case "/":
                operation = new Division();
                break;
            default:
                throw new RuntimeException("Операция не поддерживается");
        };

        ComplexNumber left = new ComplexNumber(firstReal, firstImaginary);

        ComplexNumber right = new ComplexNumber(secondReal, secondImaginary);
        System.out.println(operation.calculate(left, right));

//        log.info("test");




    }
}