public class Circle {
    public double radius=1.0;
    public String color = "blue";

    public Circle(){

    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(){
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public void setColor(){
        this.color = color;
    }

    public double getArea(){
        return radius * radius *Math.PI;
    }

    @Override
    public String toString() {
        return "A circle with radius= " + getRadius() + ",color is: " + getColor() + " and has area= " + getArea();
    }
}
