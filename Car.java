public class Car extends Vehicle {

    Car(String name, String type){
        super(name, type);
    }
    
    void move(){
        System.out.println(super.name+" is moving");
    }
}
