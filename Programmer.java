public class Programmer extends Employee {
    
    Programmer(String name, String address, String position, int age, int id){
        super(name, address, position, age, id);
    }

    void calculateSalary(){
        System.out.println("Base pay: "+30000);
        System.out.println("Home rent: "+(30000*.10));
        System.out.println("Phone bill:"+(30000*.05));
    }

}
