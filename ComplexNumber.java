// public class ComplexNumber {
//     private double real;
//     private double imaginary;

//     // Default Constructor (initialize to 0 + 0i)
//     public ComplexNumber() {
//         this(0, 0);
//     }

//     // Parameterized Constructor with real part only
//     public ComplexNumber(double real) {
//         this(real, 0);
//     }

//     // Parameterized Constructor with both real and imaginary parts
//     public ComplexNumber(double real, double imaginary) {
//         this.real = real;
//         this.imaginary = imaginary;
//     }

//     // Getter methods, arithmetic operations...

//     // Override toString() method to print complex number in complex form
//     @Override
//     public String toString() {
//         if (imaginary >= 0) {
//             return real + " + " + imaginary + "i";
//         } else {
//             return real + " - " + (-imaginary) + "i";
//         }
//     }

//     public static void main(String[] args) {
//         // Example usage
//         ComplexNumber num1 = new ComplexNumber(); // Initializes to 0 + 0i
//         ComplexNumber num2 = new ComplexNumber(3); // Initializes to 3 + 0i
//         ComplexNumber num3 = new ComplexNumber(2, -5); // Initializes to 2 - 5i

//         System.out.println("num1: " + num1); // Prints 0 + 0i
//         System.out.println("num2: " + num2); // Prints 3 + 0i
//         System.out.println("num3: " + num3); // Prints 2 - 5i
//     }
// }

public class ComplexNumber {
    double real, imag;

    public ComplexNumber() {

    }
    
    public ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public ComplexNumber addComplex(ComplexNumber c) {
        ComplexNumber sum = new ComplexNumber();
        sum.real = this.real + c.real;
        sum.imag = this.imag + c.imag;
        return sum;
    }

    //using static method does not require object of ComplexNumber to call this
    public static ComplexNumber sumComplex(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber sum = new ComplexNumber();
        sum.real = c1.real + c2.real;
        sum.imag = c1.imag + c2.imag;
        return sum;
    }

    public void showComplexNumber() {
        System.out.println(real + " + " + imag + "i");
    }

    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber();
        ComplexNumber num2 = new ComplexNumber(3, 4);
        ComplexNumber sum = num1.addComplex(num2);
        sum.showComplexNumber();
        ComplexNumber sum2 = ComplexNumber.sumComplex(num1, num2);
        sum2.showComplexNumber();
    }
    
}