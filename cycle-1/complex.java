import java.util.Scanner;

public class complex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the real part of the first complex number: ");
        double real1 = input.nextDouble();
        System.out.print("Enter the imaginary part of the first complex number: ");
        double imaginary1 = input.nextDouble();
        System.out.print("Enter the real part of the second complex number: ");
        double real2 = input.nextDouble();
        System.out.print("Enter the imaginary part of the second complex number: ");
        double imaginary2 = input.nextDouble();

        double realResult = real1 + real2;
        double imaginaryResult = imaginary1 + imaginary2;
    System.out.println("Name:Febin fathima\nReg No:22MCA025\nCourse Code and Name: 20MCA132  OBJECT ORIENTED PROGRAMMING LAB\nDate:28/03/2023\n\n");
        System.out.println("The sum of the two complex numbers is: " + realResult + " + " + imaginaryResult + "i");
    }
}
