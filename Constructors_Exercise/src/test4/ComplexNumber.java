package test4;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    //method overload
    public void add(ComplexNumber complexNum) {
        add(complexNum.getReal(), complexNum.getImaginary());
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    //method overload
    public void subtract(ComplexNumber complexNum) {
        this.real -= complexNum.getReal();
        this.imaginary -= complexNum.getImaginary();
    }
}
