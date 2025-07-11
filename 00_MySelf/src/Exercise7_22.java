abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition() {
        return this.p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}

class Point {
    int x;
    int y;

    Point() {
        this(0, 0);
    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}

class Circle extends Shape {
    double r;

    Circle(double r) {
        super();
        this.r = r;
    }

    public double calcArea() {
        return this.r * this.r * Math.PI;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public double calcArea() {
        return this.width * this.height;
    }

    public boolean isSquare() {
        return this.width == this.height;
    }
}

public class Exercise7_22 {
    static double sumArea(Shape[] arr) {
        double sum = 0;
        for (Shape s : arr) {
            sum += s.calcArea();
        }
        return sum;
    }

    public static void main(String[] args) {
        Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
        System.out.println("면적의 합:" + sumArea(arr));
    }
}
