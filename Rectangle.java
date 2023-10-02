public class Rectangle extends Shape {
    Rectangle(String color, double height, double width){
        super(color, height, width);
    }

    void area(){
        System.out.println("Rectangle area: " + super.color + " -> " + 0.5 * super.height * super.width);
    }

}
