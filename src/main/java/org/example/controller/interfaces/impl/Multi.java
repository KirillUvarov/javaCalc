package org.example.controller.interfaces.impl;

import org.example.controller.interfaces.Operation;
import org.example.model.ComplexNumber;

public class Multi implements Operation {

    @Override
    public ComplexNumber calculate (ComplexNumber left, ComplexNumber right){
        double a = left.real();
        double b = left.imaginary();
        double c = right.real();
        double d = right.imaginary();
        double newR = (a*c - b*d);
        double newI = (b*c + a*d);
        return new ComplexNumber(newR, newI);

    }


}
