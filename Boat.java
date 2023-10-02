public class Boat extends Vehicle {

    Boat(String name, String type){
        super(name, type);
    }

    void move(){
        System.out.println(super.name+" is moving");
    }
    
}
