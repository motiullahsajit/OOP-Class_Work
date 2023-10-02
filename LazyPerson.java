public class LazyPerson extends Person1 {
    LazyPerson(String name, int age){
        super(name, age);
    }
    void eat(){
        System.out.println(super.name+" eats a lot!");
    }
    void exercises(){
        System.out.println("Don't do any exercise!");

    }
}
 
