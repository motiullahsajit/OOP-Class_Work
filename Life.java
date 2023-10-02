public class Life {
    public static void main(String[] args){
        Person1 person1 = new Athlete("Sajit", 22);
        person1.eat();
        person1.exercises();
        
        Person1 person2 = new LazyPerson("Nabila", 22);
        person2.eat();
        person2.exercises();
    } 
}
