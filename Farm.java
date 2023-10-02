public class Farm {
    public static void main(String[] args){
        Animal dog = new Dog();
        dog.age = 1;
        System.out.println("Animal Age:"+dog.getAge());
        dog.printMove();
    }
}
