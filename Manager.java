public class Manager extends Employee{
    
    Manager(String name, String address, String position, int age, int id){
        super(name, address, position, age, id);
    }

    void calculateSalary(){
        System.out.println("Base pay: "+40000);
        System.out.println("Home rent: "+(40000*.10));
        System.out.println("Phone bill:"+(40000*.05));
        System.out.println("Medical cost:"+(40000*.12));
    }

}
