abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}
class Triangle extends Shape{
    double a,b,c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @java.lang.Override
    double getArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s *(s - a)*(s - b)*(s - c));
    }

    @java.lang.Override
    double getPerimeter() {
        return a + b + c;
    }
}
class Rectangle extends Shape{
    double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @java.lang.Override
    double getPerimeter() {
        return a * 2 + b * 2;
    }

    @java.lang.Override
    double getArea() {
        return a * b;
    }
}
class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @java.lang.Override
    double getPerimeter() {
        return 4 * Math.PI * radius;
    }

    @java.lang.Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}