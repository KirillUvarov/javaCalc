package org.example.model;


public record ComplexNumber(double real, double imaginary) {

    //

    @Override
    public String toString() {

        return "%s %s %si".formatted(real, imaginary < 0 ? "" : "+", imaginary);
    }
}
