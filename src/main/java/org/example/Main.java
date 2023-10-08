package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.model.ComplexNumber;

import java.util.Scanner;

@Slf4j
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        scanner.nextDouble();
        log.info("test");
        ComplexNumber complexNumber = new ComplexNumber();
        complexNumber.getReal();
        System.out.println("Hello world!");
    }
}