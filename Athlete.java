public class Athlete extends Person1 {
    Athlete(String name, int age){
        super(name, age);
    }
    void eat(){
        System.out.println(super.name+" eats a healthy diet!");
    }
    void exercises(){
        System.out.println("Do exercise regularly!");
    }
}
