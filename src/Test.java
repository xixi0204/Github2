abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
}
class Circle extends Shape {
    private double r;
    public Circle(double r) {
        this.r = r;
    }
    public double area() {
        return Math.PI*r*r;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
class square extends Shape {
    private double side1;
    private double side2;

    public square(double s1, double s2) {
        side1 = s1;
        side2 = s2;
    }

    public double area() {
        return side1 * side2;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
class Rectangle extends Shape{
    private double side1;
    private double side2;
    public Rectangle(double s1, double s2){
        side1=s1;
        side2=s2;
    }
    public double area(){
        return side1*side2;
    }

    @Override
    public double perimeter() {
        return 0;
    }
}
class TestPoly {
    public static void main(String[] args) {
        Shape s1=new Circle(3);
        System.out.println("圆形面积为:"+s1.area());
        Shape s2=new square(4,4 );
        System.out.println("正方形面积为:"+s2.area());
        Shape s3=new Rectangle(2,5);
        System.out.println("长方形面积为："+s3.area());
    }
}
