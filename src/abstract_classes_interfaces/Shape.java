package abstract_classes_interfaces;

abstract class Shape {
    int numSides;

    public Shape(int numSides){
        this.numSides = numSides;
    }
    public int getShape(){
        return numSides;
    }
    abstract float getArea();

    abstract float getPerimeter();
}
