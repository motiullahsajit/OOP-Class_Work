abstract public class Vehicle {
    String name;
    String type;

    Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    void carry(){
        System.out.println("It is carrying item");
    }

    abstract void move();

}
