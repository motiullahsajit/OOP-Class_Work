public class Employee{
    String name;
    String address;
    String position;
    int age;
    int id;
    
    Employee(String name, String address, String position, int age, int id){
        this.name = name;
        this.address = address;
        this.position = position;
        this.age = age;
        this.id = id;
    }

    void calculateSalary(){
        System.out.println("Base pay: "+20000);
        System.out.println("Home rent: "+(20000*.10));
    }

}