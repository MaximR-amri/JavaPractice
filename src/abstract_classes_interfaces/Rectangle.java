package abstract_classes_interfaces;

public class Rectangle extends Shape implements Resizable {

    float width;
    float height;


    public Rectangle( int numbsides, float width, float height) {
        super(numbsides);
        this.width = width;
        this.height = height;
    }

    public float getArea(){
        return width * height;
    }
    public float getPerimeter(){
        return width*2 + height*2;
    };

    @Override
    public void resize(double x) {
        float newWidth = width * (float) x;
        float newHeight = height * (float) x;
        width = newWidth;
        height = newHeight;

    }
}
