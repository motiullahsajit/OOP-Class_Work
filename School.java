public class School {

    public static void main(String[] args){
        Student student1 = new Student();

        student1.setName("Sajit");
        student1.setAge(21);
        student1.setRollNumber(1);

        System.out.println("Student Information");
        System.out.println("Name: " + student1.getName());
        System.out.println("Roll Number: "+ student1.getRollNumber());
        System.out.println("Age: " + student1.getAge());

        student1.setName("Ishita");
        student1.setAge(24);
        student1.setRollNumber(2);

        System.out.println("Student Information Updated");
        System.out.println("Name: " + student1.getName());
        System.out.println("Roll Number: "+ student1.getRollNumber());
        System.out.println("Age: " + student1.getAge());

    }
    
}
