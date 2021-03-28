package abstract_classes_interfaces;

public class RtTriangle extends Shape{
    float width;
    float height;

    public RtTriangle(int numSides, float width, float height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    public float getArea(){
        float x = (width*height)/2;
        return x;
    }
    public float getPerimeter(){
        float x = 3 * width;
        return x;
    };
}
