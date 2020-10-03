import java.awt.*;

public class Ex_8_4 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setLength(5);
        rectangle1.setWidth(10);
        System.out.println("Length = " + rectangle1.getLength() + "; Width = " + rectangle1.getWidth());
        System.out.println("Perimeter = " + rectangle1.getPerimeter());
        System.out.println("Area = " + rectangle1.getArea());
    }
}
class Rectangle{
    private float length;
    private float width;

    Rectangle() {
        length = 1;
        width = 1;
    }

    Rectangle(float length, float width) {
        setLength(length);
        setWidth(width);
    }


    public void setLength(float length) {
        if(length > 0.0 && length < 20.0) {
            this.length = length;
        }
    }

    public float getLength() {
        return length;
    }

    public void setWidth(float width) {
        if (width > 0.0 && width <= 20){
            this.width = width;
        }
    }

    public float getWidth() {
        return width;
    }
    public float getPerimeter() {
        return ((length + width) * 2);
    }

    public float getArea() {
        return (length * width);
    }
}
