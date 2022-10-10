public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double numa, double numb, double numc) {
        this.a = numa;
        this.b = numb;
        this.c = numc;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return ((-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a));
    }

    public double getRoot2() {
        return ((-this.b - Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a));
    }

}
