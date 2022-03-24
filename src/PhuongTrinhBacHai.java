import java.util.Scanner;

public class PhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào các tham số để giải phương trình bậc 2 ax2 + bx + c = 0 (a khác 0): ");
        System.out.print("a = ");
        double a = sc.nextDouble();
        System.out.print("b = ");
        double b = sc.nextDouble();
        System.out.print("c = ");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);

        double delta = quadraticEquation.getDiscriminant();
        System.out.println("delta = " + delta);
        if (delta > 0) {
            double r1 = quadraticEquation.getRoot1();
            double r2 = quadraticEquation.getRoot2();
            System.out.println("Phương trình có 2 nghiệm là x1 = " + r1 + " và x2 = " + r2);
        } else if (delta == 0) {
            double r1 = -b/(2*a);
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + r1);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}

