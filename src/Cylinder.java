public class Cylinder extends Circle {
    public double height;

    public Cylinder(double radius , double height ,String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(){
        this.height = height;
    }

    public double getVolumetric(){
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "A cylinder with radius= " + getRadius() + ",height= " + getHeight() + " and color is " + getColor() + " has volumetric= " + getVolumetric() + ", which is a subclass of " + super.toString();
    }
}
