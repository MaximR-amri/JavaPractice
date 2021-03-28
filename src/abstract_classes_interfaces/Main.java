package abstract_classes_interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape r = new Rectangle(4,3,4);
        Shape t = new RtTriangle(3, 5, 4);

        Rectangle r1 = new Rectangle(4, 2, 3);

        System.out.println("Interface - Area: " + r1.getArea());
        System.out.println("Interface - Perimeter: "+ r1.getPerimeter());
        r1.resize(2);

        System.out.println("Interface - Area: " + r1.getArea());
        System.out.println("Interface - Perimeter: "+ r1.getPerimeter());

        ArrayList<Shape> list = new ArrayList<>();
        list.add(r);
        list.add(t);
        System.out.println("Polymorphism - Area: " + r.getArea());
        System.out.println("Polymorphism - Perimeter: "+ r.getPerimeter());
        System.out.println("Polymorphism - Area: " + t.getArea());
        System.out.println("Polymorphism - Perimeter: "+ t.getPerimeter());

        for(Shape s : list){
            if(s instanceof Rectangle){
                ((Rectangle) s).resize(0.5);
            }
        }
        System.out.println("Polymorphism post-iteration - Area: " + r.getArea());
        System.out.println("Polymorphism post-iteration - Perimeter: "+ r.getPerimeter());
        System.out.println("Polymorphism post-iteration - Area: " + t.getArea());
        System.out.println("Polymorphism post-iteration - Perimeter: "+ t.getPerimeter());
    }


}
