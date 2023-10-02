public class Office {
    public static void main(String[] args){
        Employee employee = new Employee("John","House-49","Junior",22, 123);
        employee.calculateSalary();
        
        Employee programmer = new Programmer("Smith","Dhaka","Senior",23,312);
        programmer.calculateSalary();

        Employee manager = new Manager("Sajit","Dhaka","Senior",21,663);
        manager.calculateSalary();
    }

}
