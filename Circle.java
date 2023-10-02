public class Circle extends Shape {
    Circle(String color,double radius){
        super(color,radius);
    }
    void area(){
        System.out.println("Circle area: " + super.color + " -> " + 3.1416 * super.radius * super.radius);
    }
}
