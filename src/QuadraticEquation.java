public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        double delta = Math.pow(b, 2) - (4 * a * c);
        return delta;
    }

    public double getRoot1() {
        double r1 = (-b + Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b - Math.pow(b * b - 4 * a * c, 0.5)) / (2 * a);
        return r2;
    }

    @Override
    public String toString() {
        return "QuadraticEquation{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
