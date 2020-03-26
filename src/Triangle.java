import java.util.Scanner;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        double p = getPerimeter()/2;
        return (double) Math.round(Math.sqrt(p * (p - side1) * (p - side2) * (p - side3))*100)/100;
    }

    @Override
    public String toString() {
        if (isTriSide(side1, side2, side3)) {
            return "Triangle{"
                    + "side 1: " + side1
                    + ",side 2: " + side2
                    + ",side 3: " + side3
                    + "\n\t\tPerimeter: " + getPerimeter()
                    + ", Area: " + getArea()
                    +"\n\t\t"+ super.toString()
                    + '}';
        }else  return "Your triangle is exist in another universe";
    }

    public void inputSide() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Input side 1:");
        side1 = scn.nextDouble();
        System.out.print("Input side 2:");
        side2 = scn.nextDouble();
        System.out.print("Input side 3:");
        side3 = scn.nextDouble();
    }

    private boolean isTriSide(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side1 + side2 < side3
                || side2 + side3 < side1 || side1 + side3 < side2) return false;
        else return true;
    }
}
