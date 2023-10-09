package org.example.controller.interfaces.impl;

import org.example.controller.interfaces.Operation;
import org.example.model.ComplexNumber;

public class Add implements Operation {

    @Override
    public ComplexNumber calculate(ComplexNumber left, ComplexNumber right) {
        double a = left.real();
        double b = left.imaginary();
        double c = right.real();
        double d = right.imaginary();
        double newR = a + c;
        double newI = b + d;
        return new ComplexNumber(newR, newI);
    }
}

