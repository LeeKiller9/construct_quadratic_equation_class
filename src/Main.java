import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        System.out.println("a.x^2 + b.x + c = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number a: ");
        a = scanner.nextDouble();
        System.out.print("Enter number b: ");
        b = scanner.nextDouble();
        System.out.print("Enter number c: ");
        c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println("Delta: " + equation.getDiscriminant());
        if (equation.getDiscriminant() > 0) {
            System.out.println("Solution 1: " + equation.getRoot1());
            System.out.println("Solution 2: " + equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.println("Solution 1 & 2: " + equation.getRoot1());
        } else {
            System.out.println("No solution");
        }
    }
}